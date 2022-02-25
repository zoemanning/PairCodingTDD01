package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest01(){
        Movie movie = new Movie("Home Alone",RatingEnum.R,4.5);

        String expected = "Movie: Home Alone rated R ranking 4.5";
        String actual = movie.toString();

        Assertions.assertEquals(expected,actual);
    }
}
