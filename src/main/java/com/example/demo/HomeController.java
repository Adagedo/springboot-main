package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @ResponseStatus(HttpStatus.OK) // here, you can customise your response status
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
     *      @PostMapping("/post")
            @ResponseStatus(HttpStatus.CREATED)
            public String CreatePost(){
                return "post created!!!";
            }
        Now try sending a post request and observe the error...
        shocking right?? now the post request is a bit different. 
        with the post request, we are recieving data from our clients. 
        which means we need to include an instance of the data as an argurment to our createdPost function
     */

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String CreatePost(@RequestBody String userRequestData) {
        /*
         * Now i Know its not ideal to send back a users data, but for the sake of our learning, its ok to.
         * Now be for Adding the annotation, try sending a request to the routes and oberves the response.
         * Still not getting the reponse back right?? Note for now the userRequest data should only be a plane text string or you can still send a Json data also
         * Now The main reason why we are not getting a response is because spring does not know what the userRequestDAta is.
         * Like spring will be :) ohh what is this I dont underStand this... argurment here.
         * This is where another annotations comes in which your seeing currently Know as the requetBody
         * Now After adding the requestbody annation, send a request and observe the response, you can see the data you sent right??
         * well, this is how spring handels post Request. In an a real world project, additional logic will be implemented to either save the request in a database.
         */
        return "post created!!!" + "here is the data you sent" + userRequestData;
    }
    /*
     * Now we have seen how to handel request sent fro our clients.
     * But this request if you can see, we are Accepting a String data, but ideally the web transfers data in form of Json,
     * which means we cannot handel our request as strings
     * so we Have to create our custom Data type to accomondate the users request.
     * Create a new java file and name the file UserOrder.java
     * Now we want to create our custom request data type inclusting the kinda data we want the client to send to server.
     * 
     */
    

}
