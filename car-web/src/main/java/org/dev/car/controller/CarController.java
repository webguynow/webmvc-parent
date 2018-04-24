package org.dev.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @RequestMapping(method=RequestMethod.GET, value="/home")
    public ModelAndView home() {
        ModelAndView mv= new ModelAndView("home");
        return mv;
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/junk")
    public ModelAndView junk() {
        ModelAndView mv= new ModelAndView("junk");
        return mv;
    }
	
	
}
