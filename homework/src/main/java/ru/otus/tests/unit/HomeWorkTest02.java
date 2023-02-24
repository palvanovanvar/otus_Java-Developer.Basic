package ru.otus.tests.unit;

import ru.otus.game.Dice;
import ru.otus.game.DiceImpl;

public class HomeWorkTest02 {
    public void testDiceImplFor1To6Int() {
        String scenario = "V2. Тест dice.roll() на диапазон чисел от 1 до 6";
        try {
            Dice dice = new DiceImpl();
            int diceRoll = dice.roll();
            if (diceRoll < 1 || diceRoll > 6) {
                throw new AssertionError(String.format("Ожидалось что %d будет в диапазоне чисел от 1 до 6", diceRoll));
            }

            System.out.printf("\"%s\" passed при %s вызовах %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
