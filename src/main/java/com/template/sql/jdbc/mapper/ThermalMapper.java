package com.template.sql.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.template.mvc.controllers.model.Thermal;

public class ThermalMapper implements RowMapper<Thermal> {

	@Override
	public Thermal mapRow(ResultSet rs, int rowNum) throws SQLException {

		Thermal thermal = new Thermal();
		thermal.setTimeStamp(rs.getTimestamp("CREATE_DATE"));
		thermal.setDegree(rs.getBigDecimal("DEGREE"));
		return thermal;
	}



}
