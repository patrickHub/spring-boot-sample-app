package de.codecentric.springbootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Patrick-PC on 18.06.2018.
 */

@Controller
@RequestMapping(value = {"/login"})
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("login");
        return "login";
    }

}
