package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * to make the HomeController a valid controller, we decorate it with the 
 * @Controller annotation.
 * 
 */
@Controller
public class HomeController {
    /*
     * when we send a request to the root of our website, we want this method to be called.
     * so it will be decorated with the 
     * to view this in action, go to the resource folder, we created a static/root-main.html which 
     * servers as our views.
     */
    @RequestMapping("/")
    public String main() {
        return "root-main.html";
    }
}
