package com.solarflare.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Logged home page");
        model.addAttribute("name","SurajPattade");
        model.addAttribute("github","https://github.com/solar-flareop");
        model.addAttribute("address","India");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("about page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("about services loading");
        return "services";
    }
}
