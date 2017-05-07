package com.sap.lbwtest.base;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SerialTest<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3490834831245172936L;
	private Integer agent;
	private  String name = "liao";
	private T status;

	public Integer getAgent() {
		return agent;
	}

	public void setAgent(Integer agent) {
		this.agent = agent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getStatus() {
		return status;
	}

	public void setStatus(T status) {
		this.status = status;
	}

}
