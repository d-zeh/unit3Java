package com.javaunit3.springmvc;

public interface Movie {

    String title = "";
    String maturityRating = "";
    String genre = "";

    public default String getTitle() {
        return title;
    }
    public default String getMaturityRating() {
        return maturityRating;
    }
    public default String getGenre() {
        return genre;
    }
}
