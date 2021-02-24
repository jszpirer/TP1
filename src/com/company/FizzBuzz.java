package com.company;

public class FizzBuzz {

    public String fizzBuzz(int nFizz, int nBuzz, int test){
        if (test % nBuzz==0 && test % nFizz==0){
            return "FizzBuzz";
        }
        if (test % nFizz==0){
            return "Fizz";
        }
        if (test % nBuzz==0){
            return "Buzz";
        }
        return new String (String.valueOf(test));
    }
}
