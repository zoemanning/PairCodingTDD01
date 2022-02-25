package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private RatingEnum rating;
    private Double ranking;
    private Integer length;

    public Movie(String title, RatingEnum rating, Double ranking, Integer length){
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
        this.length = length;

    }

    public String getTitle(){
        return title;}

    public void setTitle(String title){
        this.title = title;

    }

    public RatingEnum getRating(){
        return rating;
    }

    public void setRating(RatingEnum rating){
        this.rating = rating;

    }


    public Double getRanking(){
        return ranking;
    }

    public void setRanking(Double ranking){
        this.ranking = ranking;

    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }


    @Override
    public String toString(){
        return "Movie: " + title +" rated " + rating + " ranking " + ranking + " movie length " + length;
    }
}
