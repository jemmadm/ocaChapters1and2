package org.alec.game;
import org.alec.fizzbuzz.FizzBuzz;
public class Game {
     public static void main(String ... args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int i = 0;
        do {
            System.out.println(fizzBuzz.play());
            continue;
        } while (++i<100);
    }
}
