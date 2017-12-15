package com.cg.laps.dao;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.cg.laps.bean.LoanApplication;
import com.cg.laps.bean.LoanProgramsOffered;


public class LoanDAOImpl implements LoanDAO {

	@Override
	public List<LoanProgramsOffered> viewAllLoan() {
		List<LoanProgramsOffered> list=new ArrayList<LoanProgramsOffered>();
		Connection connection=null;
		connection=DBConnection.getConnection();
		String query="select * from LoanProgramsOffered";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()){
				LoanProgramsOffered bean=new LoanProgramsOffered();
				bean.setProgramName(resultSet.getString("programName"));
				bean.setDescription(resultSet.getString("description"));
				bean.setType(resultSet.getString("type"));
				bean.setDurationInYears(resultSet.getInt("durationInYears"));
				bean.setMinLoanAmount(resultSet.getFloat("minLoanAmount"));
				bean.setMaxLoanAmount(resultSet.getFloat("maxLoanAmount"));
				bean.setRateOfInterest(resultSet.getFloat("rateOfInterest"));
				bean.setProofsRequired(resultSet.getString("proofsRequired"));
				list.add(bean);
			}
		} catch (SQLException e) {
			throw new LoanException("Unable to display Loan Programs Offered");
		}
		
		return list;
	}

	@Override
	public LoanApplication viewLoanById(int applicationId) {
		LoanApplication loan=new LoanApplication();
		Connection connection=DBConnection.getConnection();
		String query="select * from loanapplication where applicationId=(?)";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, applicationId);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				loan.setApplicationId(resultSet.getInt(1));
				loan.setApplicationDate(resultSet.getDate(2));
				loan.setLoanProgram(resultSet.getString(3));
				loan.setAmountOfLoan(resultSet.getFloat(4));
				loan.setAddressOfProperty(resultSet.getString(5));
				loan.setAnnualFamilyIncome(resultSet.getFloat(6));
				loan.setDocumentProofs(resultSet.getString(7));
				loan.setGuaranteeCover(resultSet.getString(8));
				loan.setMarketValueOfGuarantee(resultSet.getFloat(9));
				loan.setStatus(resultSet.getString(10));
				loan.setDateOfInterview(resultSet.getDate(11));
			}
			System.out.println(loan);
		}catch (SQLException e) {
			throw new LoanException("Unable to view.Application Id doesnt exist");
		}
		return loan;
	}
			
	}
