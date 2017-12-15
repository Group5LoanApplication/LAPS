package com.cg.laps.dao;

import java.util.List;

import com.cg.laps.bean.LoanApplication;
import com.cg.laps.bean.LoanProgramsOffered;



public interface LoanDAO {
	public List<LoanProgramsOffered> viewAllLoan();
	public LoanApplication viewLoanById(int applicationId);
}
