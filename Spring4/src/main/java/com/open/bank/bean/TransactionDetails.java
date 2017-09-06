package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * This class is placeholder for backbase fields
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TransactionDetails {
	
	private String id;
	private String accountId;
	private String counterpartyAccount;
	private String counterpartyName;
	private String counterPartyLogoPath;
	private Double instructedAmount;
	private String instructedCurrency;
	private Double transactionAmount;
	private String transactionCurrency;
	private String transactionType;
	private String description;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the counterpartyAccount
	 */
	public String getCounterpartyAccount() {
		return counterpartyAccount;
	}
	/**
	 * @param counterpartyAccount the counterpartyAccount to set
	 */
	public void setCounterpartyAccount(String counterpartyAccount) {
		this.counterpartyAccount = counterpartyAccount;
	}
	/**
	 * @return the counterpartyName
	 */
	public String getCounterpartyName() {
		return counterpartyName;
	}
	/**
	 * @param counterpartyName the counterpartyName to set
	 */
	public void setCounterpartyName(String counterpartyName) {
		this.counterpartyName = counterpartyName;
	}
	/**
	 * @return the counterPartyLogoPath
	 */
	public String getCounterPartyLogoPath() {
		return counterPartyLogoPath;
	}
	/**
	 * @param counterPartyLogoPath the counterPartyLogoPath to set
	 */
	public void setCounterPartyLogoPath(String counterPartyLogoPath) {
		this.counterPartyLogoPath = counterPartyLogoPath;
	}
	/**
	 * @return the instructedAmount
	 */
	public Double getInstructedAmount() {
		return instructedAmount;
	}
	/**
	 * @param instructedAmount the instructedAmount to set
	 */
	public void setInstructedAmount(Double instructedAmount) {
		this.instructedAmount = instructedAmount;
	}
	/**
	 * @return the instructedCurrency
	 */
	public String getInstructedCurrency() {
		return instructedCurrency;
	}
	/**
	 * @param instructedCurrency the instructedCurrency to set
	 */
	public void setInstructedCurrency(String instructedCurrency) {
		this.instructedCurrency = instructedCurrency;
	}
	/**
	 * @return the transactionAmount
	 */
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * @return the transactionCurrency
	 */
	public String getTransactionCurrency() {
		return transactionCurrency;
	}
	/**
	 * @param transactionCurrency the transactionCurrency to set
	 */
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TransactionDetails [id=" + id + ", accountId=" + accountId + ", counterpartyAccount="
				+ counterpartyAccount + ", counterpartyName=" + counterpartyName + ", counterPartyLogoPath="
				+ counterPartyLogoPath + ", instructedAmount=" + instructedAmount + ", instructedCurrency="
				+ instructedCurrency + ", transactionAmount=" + transactionAmount + ", transactionCurrency="
				+ transactionCurrency + ", transactionType=" + transactionType + ", description=" + description + "]";
	}
	
}
