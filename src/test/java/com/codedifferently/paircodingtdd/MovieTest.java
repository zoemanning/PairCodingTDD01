package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest01() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        String expected = "Movie: Home Alone rated R ranking 4.5 movie length 180";
        String actual = movie.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest() {
        Movie movie = new Movie("Titanic", RatingEnum.R, 4.5, 180);

        String expected = "Titanic";
        String actual = movie.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTitleTest() {
        Movie movie = new Movie("Titanic", RatingEnum.R, 4.5, 180);

        String expected = "Scarface";
        movie.setTitle("Scarface");
        String actual = movie.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRatingTest () {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        RatingEnum expected = RatingEnum.R;
        RatingEnum actual = movie.getRating();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRatingTest() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        RatingEnum changeRating = RatingEnum.PG;
        RatingEnum expected = changeRating;
        movie.setRating(RatingEnum.PG);
        RatingEnum actual = movie.getRating();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRankingTest () {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        Double expected = 4.5;
        Double actual = movie.getRanking();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRankingTest() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        Double changeRanking = 4.7;
        Double expected = changeRanking;
        movie.setRanking(4.7);
        Double actual = movie.getRanking();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  getLengthTest() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        Integer expected = 180;
        Integer actual = movie.getLength();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLengthTest() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        Integer changeLength = 79;
        Integer expected = changeLength;
        movie.setLength(79);
        Integer actual = movie.getLength();

        Assertions.assertEquals(expected, actual);

    }



}
