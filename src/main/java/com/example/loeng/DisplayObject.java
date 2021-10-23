package com.example.loeng;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisplayObject {

    @Autowired
    private DisplayItem displayItem;



    public void printLn() {
        System.out.println("Running DisplayObject");
    }

    public String getName() {
        return "Kristjan";
    }

}
