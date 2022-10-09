package com.bhavna.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WelcomeController{
    @RequestMapping(value="/Welcome.html",method=RequestMethod.GET)
    public String display() {
        return "welcome1.jsp";
    }
}