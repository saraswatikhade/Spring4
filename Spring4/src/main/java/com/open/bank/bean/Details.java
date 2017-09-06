package com.open.bank.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author e5542274
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Details {


	    private String description;

	    private Value value;

	    private String type;

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

		/**
		 * @return the value
		 */
		public Value getValue() {
			return value;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(Value value) {
			this.value = value;
		}

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Details [description=" + description + ", value=" + value + ", type=" + type + "]";
		}
	    
}
