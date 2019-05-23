package org.alec.fizzbuzz;

import static org.alec.words.Words.*; //static import

public class FizzBuzz {

    int currentNumber = 1; //variable in the wrong scope - was local

    public String play() {
        String result;
        int remainder = currentNumber % 15;

        switch (remainder){
            default:
                result = Integer.toString(currentNumber); //can't assign int to String
                break; //missing break statement
            case 3:
            case 6:
            case 9:
            case 12:
                result = FIZZ; //reference to constant via class is wrong given static import
                break;
            case 5:
            case 10:
                result = BUZZ;
                break;
            case 0: //number was wrong (genuine error) - was 15
                result = FIZZ + BUZZ;
                break;
        }
        currentNumber++; //can't call a method on a primitive, and increment() isn't a thing
        return result;
    }
}
