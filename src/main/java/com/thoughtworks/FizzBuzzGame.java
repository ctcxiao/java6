package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(dealWithNum(i));
            results.add(dealWithNum(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String dealWithNum(int i) {

        String result = String.valueOf(i);
        if (result.contains("3")){
            return "Fizz";
        }

        if (i % 5 == 0 && i % 7 == 0 && i % 3 == 0) {
            return "FizzBuzzWhizz";
        }

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0 && i % 7 == 0) {
            return "FizzWhizz";
        }

        if (i % 5 == 0 && i % 7 == 0) {
            return "BuzzWhizz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }

        if (i % 7 == 0) {
            return "Whizz";
        }

        return result;
    }
    
}


