package com.solarflare.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Logged home page");
        model.addAttribute("name", "SurajPattade");
        model.addAttribute("github", "https://github.com/solar-flareop");
        model.addAttribute("address", "India");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("about page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("about services loading");
        return "services";
    }

    @GetMapping("/contact")
    public String contactPage() {
        System.out.println("about contact loading");
        return "contact";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("login page loader");
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        System.out.println("register lage lodaded");
        return "register";
    }

}
