package com.cg.laps.bean;

import java.util.Date;

public class LoanApplication {
	private int applicationId;
	private Date applicationDate; 
	private String loanProgram;
	private float amountOfLoan;
	private String addressOfProperty;
	private float annualFamilyIncome;
	private String documentProofs;
	private String guaranteeCover;
	private float marketValueOfGuarantee;
	private String status;
	private Date dateOfInterview;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getLoanProgram() {
		return loanProgram;
	}
	public void setLoanProgram(String loanProgram) {
		this.loanProgram = loanProgram;
	}
	public float getAmountOfLoan() {
		return amountOfLoan;
	}
	public void setAmountOfLoan(float amountOfLoan) {
		this.amountOfLoan = amountOfLoan;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public float getAnnualFamilyIncome() {
		return annualFamilyIncome;
	}
	public void setAnnualFamilyIncome(float annualFamilyIncome) {
		this.annualFamilyIncome = annualFamilyIncome;
	}
	public String getDocumentProofs() {
		return documentProofs;
	}
	public void setDocumentProofs(String documentProofs) {
		this.documentProofs = documentProofs;
	}
	public String getGuaranteeCover() {
		return guaranteeCover;
	}
	public void setGuaranteeCover(String guaranteeCover) {
		this.guaranteeCover = guaranteeCover;
	}
	public float getMarketValueOfGuarantee() {
		return marketValueOfGuarantee;
	}
	public void setMarketValueOfGuarantee(float marketValueOfGuarantee) {
		this.marketValueOfGuarantee = marketValueOfGuarantee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	
}
