package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private RatingEnum rating;
    private Double ranking;

    public Movie(String title, RatingEnum rating, Double ranking){
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
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

    public Double getRanking(){
        return ranking;
    }

    public void setRanking(Double ranking){

    }

    @Override
    public String toString(){
        return "Movie: " + title +" rated " + rating + " ranking " + ranking;
    }
}
