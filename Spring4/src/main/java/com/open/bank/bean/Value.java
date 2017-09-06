package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * Placeholder for amount and currency 
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Value {
	
	private String amount;
    private String currency;
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Value [amount=" + amount + ", currency=" + currency + "]";
	}
    
}
