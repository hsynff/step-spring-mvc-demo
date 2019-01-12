package com.step.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping({"/", "/index", "/home"})
    public String index(HttpSession session, Model model){
        if (session.getAttribute("message")!=null){
            model.addAttribute("message", session.getAttribute("message"));
            session.removeAttribute("message");
        }
        return "index";
    }

}
