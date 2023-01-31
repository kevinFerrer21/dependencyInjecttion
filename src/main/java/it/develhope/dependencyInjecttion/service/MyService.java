package it.develhope.dependencyInjecttion.service;

import it.develhope.dependencyInjecttion.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;
    
    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("My service construcotr has been called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("getMyComponentName() has been called");
        return myComponent.getMyComponentName();
    }

}
