package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.Dice;
import ru.otus.game.DiceImpl;

public class HomeWorkTest01 {
    public void testDiceImplForNegativeInt() {
        final int ITERATIONS = 20;
        String scenario = "V1. Тест dice.roll() на отрицательное число";
        try {
            Dice dice = new DiceImpl();
            int diceRoll = dice.roll();
            for (int i=0; i<ITERATIONS; i++) {
                if (diceRoll < 0) {
                    throw new IllegalArgumentException("dice.roll() " + diceRoll + " less then 0");
                }
            }

            System.out.printf("\"%s\" passed при %s вызовах %n", scenario, ITERATIONS);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
