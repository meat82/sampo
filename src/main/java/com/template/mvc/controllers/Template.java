package com.template.mvc.controllers;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Template {

    private static final Logger LOGGER = Logger.getLogger(Template.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test(Locale locale, Model model) {
        if(LOGGER.isInfoEnabled()){
            LOGGER.info("Welcome sampo! The client locale is {}." + locale.toString());
        }

        return new ModelAndView("template");
    }
}
