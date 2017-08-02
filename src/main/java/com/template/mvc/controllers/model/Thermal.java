package com.template.mvc.controllers.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Thermal {

	private Date date;
	
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
	
}
