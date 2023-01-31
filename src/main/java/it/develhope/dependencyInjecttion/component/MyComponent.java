package it.develhope.dependencyInjecttion.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent() {

        System.out.println("My component costructor has been called");
        this.myComponentName = "component name";
    }

    public String getMyComponentName() {

        String myComponentImmutableName = myComponentName;
        return myComponentImmutableName;
    }
}
