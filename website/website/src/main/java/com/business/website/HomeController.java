package com.business.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("companyName", "BSBA - MM");
        model.addAttribute("tagline", "Under Development");
        //model.addAttribute("tagline", "Welcome to our official website!");
        return "index";
    }
}