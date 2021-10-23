package com.example.loeng.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class MovieController {

    static List<Movie> movies = new ArrayList<>();

    public MovieController() {
        movies.add(new Movie(1, "John Wick", "2001"));
        movies.add(new Movie(2,"Black Panther", "1992"));
        movies.add(new Movie(3,"Madonna", "2015"));
        movies.add(new Movie(4,"Nukitsamees", "1990"));
        movies.add(new Movie(5,"Matrix", "2000"));
        movies.add(new Movie(6,"Film", "1991"));
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable int id) throws Exception {

        for(Movie movie: movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
          throw new Exception(String.format("Movie with ID : %d not found", id));

    }

    @GetMapping("/movies/name/{name}")
    public Movie getMovieByName(@PathVariable String name) throws Exception {

        for(Movie movie: movies) {
            if (movie.getName().trim().equals(name)) {
                return movie;
            }
        }
        throw new Exception(String.format("Movie with ID : %s not found", name));

    }
}
