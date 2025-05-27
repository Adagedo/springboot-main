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
     * to run this project, run mvn:spring-boot:runon your terminal.
     * carefully observe and see this, 'Tomcat initialized with port 8080 (http)' which signified your project is running on localhost
     * port 8080
     * go to your browser and type 'http://localhost:8080', and your are up and running. you just build your first spring-boot application
     */
    @RequestMapping("/")
    public String main() {
        return "root-main.html";
    }
}
