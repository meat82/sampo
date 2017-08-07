package com.template.mvc.controllers;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.template.mvc.controllers.model.Thermal;
import com.template.sql.jdbc.services.ThermalService;

@Controller
public class Projects {

	private static final Logger logger = Logger.getLogger(Projects.class);
	
	@Autowired
	ThermalService thermalService;
	
    @RequestMapping(value = "/sauna", method = RequestMethod.GET)
    public String sauna(Locale locale, ModelMap modelMap) {
        List<Thermal> thermals =  thermalService.getThermals();
    	ObjectMapper mapper = new ObjectMapper();
    	String mappedValue = null;
    	try {
            mappedValue = mapper.writeValueAsString(thermals);
        } catch (JsonProcessingException e) {
        	logger.error(e, e);
        }
    	if(logger.isDebugEnabled()){
    		logger.debug("mappedValue: " + mappedValue);
    	}
        modelMap.addAttribute("thermals", mappedValue);
        return "sauna";
    }
	
}
