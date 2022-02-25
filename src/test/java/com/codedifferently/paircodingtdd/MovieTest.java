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
    public void getRating() {
        Movie movie = new Movie("Home Alone", RatingEnum.R, 4.5, 180);

        RatingEnum expected = RatingEnum.R;
        RatingEnum actual = movie.getRating();

        Assertions.assertEquals(expected, actual);
    }
}
