package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Placeholder for metadata
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Metadata {
	
	private String imageURL;

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Metadata [imageURL=" + imageURL + "]";
	}
	
}
