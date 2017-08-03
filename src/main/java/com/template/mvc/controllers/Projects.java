package com.template.mvc.controllers;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.template.mvc.controllers.model.Thermal;
import com.template.sql.jdbc.services.ThermalService;

@Controller
public class Projects {

	private static final Logger logger = Logger.getLogger(Projects.class);
	
	@Autowired
	ThermalService thermalService;
	
    @RequestMapping(value = "/sauna", method = RequestMethod.GET)
    public String sauna(Locale locale, Model model) {
        if(logger.isInfoEnabled()){
        	logger.info("Welcome home! The client locale is {}." + locale.toString());
        }
        List<Thermal> thermals =  thermalService.getThermals();
        
        for (Thermal thermal : thermals) {
			System.out.println("thermal: " + thermal);
			Date date = new Date(thermal.getTimeStamp().getTime());
			System.out.println("date: " + date);
		}
        return "sauna";
    }
	
}
