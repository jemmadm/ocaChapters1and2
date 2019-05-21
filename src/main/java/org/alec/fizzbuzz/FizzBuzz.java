package org.alec.fizzbuzz;

static import org.alec.words.Words.*;

public class FizzBuzz {

    public String play() {
        int currentNumber = 1;
        String result;
        if (currentNumber % 15 == 0) {
            result = FIZZ + BUZZ;
        } else if (currentNumber % 5 == 0) {
            result += BUZZ;
        } else if (currentNumber % 3 == 0) {
            result = Words.FIZZ;
        } else {
            result = currentNumber;
        }
        currentNumber.increment();
        return result;
    }
}
