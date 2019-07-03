package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class NameMatchRegexTest {


    NameMatchRegex  matchRegex;

    @Before
    public void setup(){

        matchRegex = new NameMatchRegex();
    }

    @After
    public void teardown(){

        matchRegex = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){


    }

    @AfterClass
    public static void teardownAfterClass(){


    }

    @Test
    public void  givenStringShouldReturntrue (){

        //Arrange

        //Act
        boolean result =  matchRegex.namematching("His name is harry");

        boolean expected = true ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givenStringShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  matchRegex.namematching("His name is Henry");

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givennumberShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  matchRegex.namematching("23872 23872979");

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givennullShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  matchRegex.namematching(null);

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }

}