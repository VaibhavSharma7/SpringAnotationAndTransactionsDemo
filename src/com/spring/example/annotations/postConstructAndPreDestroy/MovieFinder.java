package com.spring.example.annotations.postConstructAndPreDestroy;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MovieFinder {

    @PostConstruct
    public void populateMovieCache() {
        System.out.println(" *** populateMovieCache() on creation of bean *** ");
        // populates the movie cache upon initialization...
    }

    @PreDestroy
    public void clearMovieCache() {
        System.out.println(" *** clearMovieCache() on creation of bean *** ");
        // clears the movie cache upon destruction...
    }
}
