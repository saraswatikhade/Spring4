package com.open.bank.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * 
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ThisAccount {
	
	private String id;

    private List<Holders> holders;

    private String number;
    
    private String kind;
    
    @JsonProperty("IBAN")
    private String iban;

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
	 * @return the holders
	 */
	public List<Holders> getHolders() {
		return holders;
	}

	/**
	 * @param holders the holders to set
	 */
	public void setHolders(List<Holders> holders) {
		this.holders = holders;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ThisAccount [id=" + id + ", holders=" + holders + ", number=" + number + ", kind=" + kind + ", iban="
				+ iban + "]";
	}
    
}
