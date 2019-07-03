package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {


    ReplaceCharacters  obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new ReplaceCharacters();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("Beforelass");

    }

    @AfterClass
    public static void teardownAfterClass(){
        System.out.println("AfterClass");

    }

    @Test
    public void  givenStringShouldReturnStringWithourChar (){

        //Arrange

        //Act
        String result =  obj.replacechar("daily dry doing dull dance");

        String expected = "faity fry foing futt fance" ;

        //Assert
        assertEquals(expected,result);

    }
//
    @Test
    public void  givenNullrShouldReturnnull (){

        //Arrange

        //Act
        String result =  obj.replacechar(null);

        String expected = null ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenSTringwithoutpresentcharrShouldReturnnull (){

        //Arrange

        //Act
        String result =  obj.replacechar("App is great");

        String expected = "App is great" ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenNullShouldReturnnull (){

        //Arrange

        //Act
        String result =  obj.replacechar(null);

        String expected = null ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenNumberShouldReturnnumber (){

        //Arrange

        //Act
        String result =  obj.replacechar("32232");

        String expected = "32232" ;

        //Assert
        assertEquals(expected,result);

    }
}