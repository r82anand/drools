package com.sivadas.anand.domain;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class BaseDTO.
 */
public class BaseDTO implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8801271436743568717L;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			return toJsonString(this);
		} catch (Exception e) {
			return super.toString();
		}
	}
	
	/**
	 * To json string.
	 *
	 * @param jsonObject the JSON object
	 * @return the string
	 * @throws Exception the exception
	 */
	protected static String toJsonString(Object jsonObject) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
//		map.registerModule(new Jdk8Module());
//		map.registerModule(new JSR310Module());
		return mapper.writeValueAsString(jsonObject);
	}
}
