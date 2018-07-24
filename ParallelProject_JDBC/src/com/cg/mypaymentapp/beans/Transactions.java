package com.cg.mypaymentapp.beans;

import java.math.BigDecimal;
import java.util.Date;

public class Transactions
{
	private String transactionType;
	private String mobileNo;
	private Date transactionDate;
	private BigDecimal balance;
	@Override
	public String toString() {
		return "Transactions [transactionType=" + transactionType + ", mobileNo=" + mobileNo + ", transactionDate="
				+ transactionDate + ", balance=" + balance + "]";
	}
	public Transactions( String mobileNo,String transactionType, Date transactionDate, BigDecimal balance) {
		super();
		this.transactionType = transactionType;
		this.mobileNo = mobileNo;
		this.transactionDate = transactionDate;
		this.balance = balance;
	}
	public Transactions() {
		super();
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
