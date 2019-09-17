package sai.service.springbootsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String getDashboard(){
        return "<h1> welcome all <h1>";
    }

    @GetMapping("/user")
    public String getUSer(){
        return "<h1> welcome User /Admin <h1>";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "<h1> welcome Admin <h1>";
    }

}
