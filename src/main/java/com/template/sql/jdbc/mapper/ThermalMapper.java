package com.template.sql.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.template.mvc.controllers.model.Thermal;
import com.template.sql.util.SQLThermalColumns;

public class ThermalMapper implements RowMapper<Thermal> {

	@Override
	public Thermal mapRow(ResultSet rs, int rowNum) throws SQLException {

		Thermal thermal = new Thermal();
		thermal.setId(rs.getInt(SQLThermalColumns.THERMAL_ID));
		thermal.setTimeStamp(rs.getTimestamp(SQLThermalColumns.CREATE_DATE));
		thermal.setDegree(rs.getBigDecimal(SQLThermalColumns.DEGREE));
		return thermal;
	}



}
