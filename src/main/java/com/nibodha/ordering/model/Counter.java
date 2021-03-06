package com.nibodha.ordering.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Nibodha [Mar 9, 2015:5:41:43 PM]
 * 
 */
@Document(collection = "counters")
public class Counter {
	@Id
	private String id;
	private int seq;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the seq
	 */
	public int getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *            the seq to set
	 */
	public void setSeq(int seq) {
		this.seq = seq;
	}
}