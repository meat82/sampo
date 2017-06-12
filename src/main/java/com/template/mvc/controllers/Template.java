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

    //private static final Logger LOGGER = LoggerFactory.getLogger(Template.class);
    private static final Logger LOGGER = Logger.getLogger(Template.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/template", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, Model model) {
        if(LOGGER.isInfoEnabled()){
            LOGGER.info("Welcome home! The client locale is {}." + locale.toString());
        }

        return new ModelAndView("template");
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test(Locale locale, Model model) {
        if(LOGGER.isInfoEnabled()){
            LOGGER.info("Welcome home! The client locale is {}." + locale.toString());
        }

        return new ModelAndView("template");
    }
}
