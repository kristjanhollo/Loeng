package com.example.loeng.Controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Movie implements Serializable {

    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String year;

    public Movie(int id, String name, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
