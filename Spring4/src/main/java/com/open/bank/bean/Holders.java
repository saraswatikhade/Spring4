package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * placeholder for account holders
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Holders {
	
	private String name;
	
	@JsonProperty("is_alias")
	private String isAlias;
	
	

	/**
	 * @return the isAlias
	 */
	public String getIsAlias() {
		return isAlias;
	}

	/**
	 * @param isAlias the isAlias to set
	 */
	public void setIsAlias(String isAlias) {
		this.isAlias = isAlias;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Holders [name=" + name + ", isAlias=" + isAlias + "]";
	}
	
}
