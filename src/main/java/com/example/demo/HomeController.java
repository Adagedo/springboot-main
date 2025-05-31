package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * to make the HomeController a valid controller, we decorate it with the 
 * @Controller annotation.
 * 
 */
@Controller
public class HomeController {
    /*
     * when we send a request to the root of our website, we want this method to be called.
     * so it will be decorated with the an anotation
     * to view this in action, go to the resource folder, we created a static/root-main.html which 
     * servers as our views.
     * to run this project, run mvn:spring-boot:runon your terminal.
     * carefully observe and see this, 'Tomcat initialized with port 8080 (http)' which signified your project is running on localhost
     * port 8080
     * go to your browser and type 'http://localhost:8080', and your are up and running. you just build your first spring-boot application
     *     @RequestMapping("/")
            public String main() {
                return "root-main.html";
            }
     *  the above code renders a html file to the browser or as we say to the client.
     * we are going to dive a little into building or creating our own apis in spring
     * enjoy...
     */
    // a get request routes
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)// here, you can customise your response status
    public String Home() {
        return "Home routes";
    }
    // a routes that in the future will return a list of post from our users
    @GetMapping("/post")
    @ResponseStatus(HttpStatus.OK)
    public String getPost() {
        return "fetching user's post...";
    }

    /*
     * Now we have seen out get route in Action. feel free to modify add and play around with the get mappings
     * The PostMapping or the post request routes, allows users or client to send request to the server
     */

     @PostMapping("/post")
     @ResponseStatus(HttpStatus.CREATED)
     public String CreatePost(){
         return "post created!!!";
     }

}
