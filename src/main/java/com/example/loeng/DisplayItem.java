package com.example.loeng;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisplayItem {

    @Autowired
    private DisplayObject displayObject;



    public void setDisplayObject(DisplayObject displayObject) {
        this.displayObject = displayObject;
    }

    public void paint() {
        System.out.println(displayObject.getName() + " Item is rendered.");
    }

}
