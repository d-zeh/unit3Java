package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {
    public String getTitle() {
        return "The Titanic Returns";
    }
    public String getMaturityRating() {
        return "R, cause they kiss";
    }
    public String getGenre() {
        return "Comedy";
    }
}
