package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class NameMatchRegexTest {


    NameMatchRegex  obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new NameMatchRegex();
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
    public void  givenStringShouldReturntrue (){

        //Arrange

        //Act
        boolean result =  obj.namematching("His name is harry");

        boolean expected = true ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givenStringShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  obj.namematching("His name is Henry");

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givennumberShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  obj.namematching("23872 23872979");

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givennullShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  obj.namematching(null);

        boolean expected = false ;

        //Assert
        assertEquals(expected,result);

    }

}