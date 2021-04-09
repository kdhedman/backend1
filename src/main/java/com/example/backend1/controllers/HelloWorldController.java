package com.example.backend1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/swe")
    public String indexSvenska(){
        return "Hejsan världen!";
    }

    @RequestMapping("/hello")
    public String helloName(@RequestParam(required = false) String firstname,
                            @RequestParam(required = false) String lastname){
        String name = "";
        if(firstname != null){
            name = firstname;
        }
        if(lastname != null){
            name = name.length() > 0 ? name += " " + lastname : lastname;
        }


        return String.format("Hello %s", name);
    }
}
