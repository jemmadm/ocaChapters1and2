package org.alec.game;

import org.alec.fizzbuzz.FizzBuzz; //import was missing (different package)

public class Game {
    static public void main(String... args) { // missing return type and placement of ... was wrong
        FizzBuzz fizzBuzz = new FizzBuzz(); //constructor call missing
        int i = 0; //scope of variable was wrong - initially declared inside loop
        do {
            System.out.println(fizzBuzz.play());
            continue;
        } while (++i<100); //missing semi-colon
    }
}
