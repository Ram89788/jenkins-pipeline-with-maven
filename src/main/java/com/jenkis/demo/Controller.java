package com.jenkis.demo;



import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String home() {
        // This returns the "home.html" page in the "resources/templates" folder
        return "homepage";
    }

}
