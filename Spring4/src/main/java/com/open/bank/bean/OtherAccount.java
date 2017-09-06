package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * placeholder for other account
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class OtherAccount {
	
	private String id;

    private Holders holder;

    private String number;

    private Metadata metadata;

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
	 * @return the holder
	 */
	public Holders getHolder() {
		return holder;
	}

	/**
	 * @param holder the holder to set
	 */
	public void setHolder(Holders holder) {
		this.holder = holder;
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
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OtherAccount [id=" + id + ", holder=" + holder + ", number=" + number + ", metadata=" + metadata + "]";
	}
    
}
