package com.open.bank.bean;
/**
 * 
 * @author e5542274
 *
 */
public class Transactions {
	
	private String id;

    private Details details;

    private OtherAccount other_account;

    private ThisAccount this_account;

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
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	/**
	 * @return the other_account
	 */
	public OtherAccount getOther_account() {
		return other_account;
	}

	/**
	 * @param other_account the other_account to set
	 */
	public void setOther_account(OtherAccount other_account) {
		this.other_account = other_account;
	}

	/**
	 * @return the this_account
	 */
	public ThisAccount getThis_account() {
		return this_account;
	}

	/**
	 * @param this_account the this_account to set
	 */
	public void setThis_account(ThisAccount this_account) {
		this.this_account = this_account;
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
		return "Transactions [id=" + id + ", details=" + details + ", other_account=" + other_account
				+ ", this_account=" + this_account + ", metadata=" + metadata + "]";
	}
    
}
