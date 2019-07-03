package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;


public class SortCharactersTest {


    SortCharacters  obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new SortCharacters();
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
    public void  givenStringShouldReturnSortedparagraph (){

        //Arrange

        //Act
        String[] result =  obj.sortWordsInParagraph("Apple is good");

        String[] expected={"Apple","good","is"};

        //Assert
        assertArrayEquals(expected,result);

    }

    @Test
    public void  givenNUmberShouldReturnSortedparagraph (){

        //Arrange

        //Act
        String[] result =  obj.sortWordsInParagraph("neelanshi676876823686 345");

        String[] expected={"345","neelanshi676876823686"};

        //Assert
        assertArrayEquals(expected,result);

    }

    @Test
    public void  givenNullShouldReturnNull (){

        //Arrange

        //Act
        String[] result =  obj.sortWordsInParagraph(null);

        String[] expected=null;

        //Assert
        assertArrayEquals(expected,result);

    }

    @Test
    public void  givenNspaceShouldReturnNull (){

        //Arrange

        //Act
        String[] result =  obj.sortWordsInParagraph(" ");

        String[] expected=null;

        //Assert
        assertArrayEquals(expected,result);

    }

}