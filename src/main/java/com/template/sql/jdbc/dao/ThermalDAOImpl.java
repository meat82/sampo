package com.template.sql.jdbc.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.template.mvc.controllers.model.Thermal;
import com.template.sql.jdbc.mapper.ThermalMapper;
import com.template.sql.util.SQLThermalCommands;

public class ThermalDAOImpl implements ThermalDAO {

    private static final Logger logger = Logger.getLogger(ThermalDAOImpl.class);

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Thermal> listAll() {
        if (logger.isDebugEnabled()) {
            logger.debug("SQL Statement: " + SQLThermalCommands.SELECT_ALL);
        }
        List<Thermal> thermals = this.jdbcTemplate.query(SQLThermalCommands.SELECT_ALL, new ThermalMapper());
        return thermals;
    }


}
