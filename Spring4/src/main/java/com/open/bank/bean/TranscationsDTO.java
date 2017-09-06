package com.open.bank.bean;

import java.util.List;
/**
 * 
 * This class is used to get the list of the transactions
 * @author Umesh
 *
 */
public class TranscationsDTO {
	
	private List<Transactions> transactions;

	/**
	 * @return the transactions
	 */
	public List<Transactions> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TranscationsDTO [transactions=" + transactions + "]";
	}
	
}
