package it.develhope.dependencyInjecttion.controller;

import it.develhope.dependencyInjecttion.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("My controller constructor has been called");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("getName has been called");
        return myService.getName();
    }

    @GetMapping("/")
    public String getWelcomeMessage(){
        System.out.println("getWelcomeMessage() has been called");
        return "Welcomeeee!";
    }
}
