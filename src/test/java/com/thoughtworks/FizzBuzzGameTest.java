package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("Fizz", fizzBuzzGame.dealWithNum(3));
        Assert.assertNotEquals("Fizz", fizzBuzzGame.dealWithNum(5));
    }

    @Test
    public void should_return_Buzz_when_have_5(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("Buzz", fizzBuzzGame.dealWithNum(5));
        Assert.assertNotEquals("Buzz", fizzBuzzGame.dealWithNum(7));
    }

    @Test
    public void should_return_Whizz_when_have_7(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("Whizz", fizzBuzzGame.dealWithNum(7));
        Assert.assertNotEquals("Whizz", fizzBuzzGame.dealWithNum(12));
    }

    @Test
    public void should_return_FizzBuzz_when_have_35(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("FizzBuzz", fizzBuzzGame.dealWithNum(15));
        Assert.assertNotEquals("FizzBuzz", fizzBuzzGame.dealWithNum(35));
    }

    @Test
    public void should_return_FizzWhizz_when_have_37(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("FizzWhizz", fizzBuzzGame.dealWithNum(21));
        Assert.assertNotEquals("FizzWhizz", fizzBuzzGame.dealWithNum(37));
    }

    @Test
    public void should_return_BuzzWhizz_when_have_57(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("BuzzWhizz", fizzBuzzGame.dealWithNum(70));
        Assert.assertNotEquals("BuzzWhizz", fizzBuzzGame.dealWithNum(57));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_have_357(){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Assert.assertEquals("FizzBuzzWhizz", fizzBuzzGame.dealWithNum(105));
        Assert.assertNotEquals("FizzBuzzWhizz", 357);
    }
}
