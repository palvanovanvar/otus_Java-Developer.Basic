package ru.otus.tests.unit;

import ru.otus.game.Dice;
import ru.otus.game.DiceImpl;

public class HomeWorkTest03 {
    public void testDiceImplForNotEqual() {
        final int ITERATIONS = 30;
        String scenario = "V3. Тест dice.roll() на генерацию разных значений";
        try {
            Dice dice = new DiceImpl();
            int diceRollFist, diceRollSecond;
            for (int i=0; i<ITERATIONS; i++) {
                diceRollFist = dice.roll();
                diceRollSecond = dice.roll();
                if (diceRollFist == diceRollSecond) {
                    throw new AssertionError(String.format("Expected %d != %d", diceRollFist, diceRollSecond));
                }
            }

            System.out.printf("\"%s\" passed при %s вызовах %n", scenario, ITERATIONS);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
