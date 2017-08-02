package com.template.mvc.controllers;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Projects {

	private static final Logger logger = Logger.getLogger(Projects.class);
	
    @RequestMapping(value = "/sauna", method = RequestMethod.GET)
    public String sauna(Locale locale, Model model) {
        if(logger.isInfoEnabled()){
        	logger.info("Welcome home! The client locale is {}." + locale.toString());
        }

        return "sauna";
    }
	
}
