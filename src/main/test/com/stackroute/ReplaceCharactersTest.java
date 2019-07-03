package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {


    ReplaceCharacters  replacechar;

    @Before
    public void setup(){

        replacechar = new ReplaceCharacters();
    }

    @After
    public void teardown(){

        replacechar = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){


    }

    @AfterClass
    public static void teardownAfterClass(){


    }

    @Test
    public void  givenStringShouldReturnStringWithourChar (){

        //Arrange

        //Act
        String result =  replacechar.replacechar("daily dry doing dull dance");

        String expected = "faity fry foing futt fance" ;

        //Assert
        assertEquals(expected,result);

    }
//
    @Test
    public void  givenNullrShouldReturnnull (){

        //Arrange

        //Act
        String result =  replacechar.replacechar(null);

        String expected = null ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenSTringwithoutpresentcharrShouldReturnnull (){

        //Arrange

        //Act
        String result =  replacechar.replacechar("App is great");

        String expected = "App is great" ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenNullShouldReturnnull (){

        //Arrange

        //Act
        String result =  replacechar.replacechar(null);

        String expected = null ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenNumberShouldReturnnumber (){

        //Arrange

        //Act
        String result =  replacechar.replacechar("32232");

        String expected = "32232" ;

        //Assert
        assertEquals(expected,result);

    }
}