package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class TransposeTest {


    Transpose  obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new Transpose();
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
    public void  givenStringShouldReturnStringTranspose (){

        //Arrange

        //Act
        String result =  obj.transpose("a quick brown fox jumps over the lazy dog");

        String expected = "a kciuq nworb xof spmuj revo eht yzal god" ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givennullShouldnull (){

        //Arrange

        //Act
        String result =  obj.transpose(null);

        String expected = null ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void  givennumberlShouldREturnNUmber (){

        //Arrange

        //Act
        String result =  obj.transpose("123 456");

        String expected = "321 654" ;

        //Assert
        assertEquals(expected,result);

    }

    @Test
    public void transposeNotNull() {

        String actual=obj.transpose("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);
    }
}