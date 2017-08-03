package com.template.mvc.controllers.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Thermal {

	private Date date;
	private Timestamp timeStamp;
	private BigDecimal degree;

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

	@Override
	public String toString() {
		return "Thermal [date=" + date + ", timeStamp=" + timeStamp + ", degree=" + degree + "]";
	}
	
}
