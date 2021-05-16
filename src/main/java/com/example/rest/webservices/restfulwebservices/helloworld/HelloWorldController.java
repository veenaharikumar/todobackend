package com.example.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "Hello World -changed5";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean getHelloWorldBean(){
        //throw new RuntimeException("something happened");
        return new HelloWorldBean("welcome-changed");
    }

    @GetMapping(path = "/hello-world/pathVariable/{name}")
    public HelloWorldBean getHelloWorldPathVariable(){
        return new HelloWorldBean("Hello World");
    }

}
