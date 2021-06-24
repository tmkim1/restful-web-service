package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (호출하는 endpoint)
    // RequestMapping(method=RequestMethod.GET, path="hello-world")
    @GetMapping(path = "hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HellWorldBean("Hello World");
    }

}
