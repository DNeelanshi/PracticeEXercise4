package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class StringMatcherTest {


    StringMatcher  obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new StringMatcher();
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
    public void  givenStringShouldReturnStringIndexes (){

        //Arrange

        //Act
        String result =  obj.matching("She sells seashells by the seashore","se");

        String expected="Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givennullShouldReturnNull (){

        //Arrange

        //Act
        String result =  obj.matching(null,"se");

        String expected = null;

        //Assert
        assertEquals(expected,result);

    }
    @Test
    public void  givenNullChoiceShouldReturnNull (){

        //Arrange

        //Act
        String result =  obj.matching("She sells seashells",null);

        String expected = null;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givenChoiceShouldReturnNull (){

        //Arrange

        //Act
        String result =  obj.matching("She sells seashells","dr");

        String expected = null;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void matchingNotNull() {

        String actual=obj.matching("She sells seashells by the seashore","se");
        assertNotNull(actual);
    }

}