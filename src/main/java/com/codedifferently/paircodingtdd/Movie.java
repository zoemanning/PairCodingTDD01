package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private RatingEnum rating;

    public Movie(String title, RatingEnum rating){
        this.title = title;
        this.rating = rating;
    }

    public String getTitle(){
        return title;}

    public void setTitle(String name){

    }

    public RatingEnum getRating(){
        return rating;
    }

    public void setRating(RatingEnum rating){

    }

    @Override
    public String toString(){
        return "Movie: " + title +" rated " + rating;
    }
}
