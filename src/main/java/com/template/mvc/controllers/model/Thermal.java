package com.template.mvc.controllers.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Thermal {

	private Date date;
	private Timestamp timeStamp;
	private BigDecimal degree;
	private int id;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getDegree() {
		return degree;
	}

	public void setDegree(BigDecimal degree) {
		this.degree = degree;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Thermal [date=" + date + ", timeStamp=" + timeStamp + ", degree=" + degree + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
}
