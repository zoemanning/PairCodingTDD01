package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest01(){
        Movie movie = new Movie("Home Alone");

        String expected = "Home Alone";
        String actual = movie.getTitle();

        Assertions.assertEquals(expected,actual);
    }
}
