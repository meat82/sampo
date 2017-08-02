package com.template.sql.jdbc.services;

import java.util.List;

import com.template.mvc.controllers.model.Thermal;
import com.template.sql.jdbc.dao.ThermalDAO;

public class ThermalServiceImpl implements ThermalService {

    private ThermalDAO thermalDAO;

    public ThermalDAO getThermalDAO() {
		return thermalDAO;
	}

	public void setThermalDAO(ThermalDAO thermalDAO) {
		this.thermalDAO = thermalDAO;
	}

	@Override
    public List<Thermal> getThermals() {
        return thermalDAO.listAll();
    }

}
