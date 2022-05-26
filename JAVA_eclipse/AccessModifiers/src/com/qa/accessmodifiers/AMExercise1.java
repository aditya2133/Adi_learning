package com.qa.accessmodifiers;

public class AMExercise1 {

	// 5 attributes, 3 constructors, getters and setters for all of them (write out at least 2 of them without generating)
	// We will use a------ class, and a runner class where we call stuff from the ---- class
	
	private String custName;
	private String custSurname;
	private int passportNumber;
	private int accountNumber;
	private float amountValue;
	
	
	// Default constructor
	public AMExercise1() {	
	}

	
	// Everything Constructor
	public AMExercise1(String firstName, String surname, int passportNumber, int accountNumber, float amountValue) {
		this.custName= firstName;
		this.accountNumber = accountNumber;
		this.custSurname = surname;
		this.accountNumber = accountNumber;
		this.amountValue = amountValue;
	}
	
	// 3rd constructor -
	public AMExercise1(String newCustName, String surname, float amountValue) {
		this.custName = newCustName;
		this.custSurname = surname;
		this.amountValue = amountValue;
	
	}


	@Override
	public String toString() {
		return "AMExercise1 [custName=" + custName + ", custSurname=" + custSurname + ", passportNumber="
				+ passportNumber + ", accountNumber=" + accountNumber + ", amountValue=" + amountValue + "]";
	}
	
	// Getters and setter for custName
	public String getCustName() {
		return custName;
	}
	public void setCustName (String newCustName) {
		this.custName = newCustName;
	}
	
	// Getter and setters for surname
	public String getCustSurname() {
		return custSurname;
		}
	public void setcustSurname(String surname) {
		this.custSurname = surname;
		}

// getters and setters for passportnumber
	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	
	// getters and setters for  account number
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// getters and setters for amountvalue
	public float getAmountValue() {
		return amountValue;
	}

	public void setAmountValue(float amountValue) {
		this.amountValue = amountValue;
	}

	
	
	
}
