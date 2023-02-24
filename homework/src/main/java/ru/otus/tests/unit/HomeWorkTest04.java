package ru.otus.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.*;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkTest04 {
    public void testGameForPrintWinner() {
        String scenario = "V1. Тест Game на вывод победителя(winnerPrinter)";
        try {
            List<String> expectedFlow = List.of("Победитель: Вася1",
                    "Победитель: Игорь1");
            List<String> actualFlow = new ArrayList<>();

            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterSpy(actualFlow);
            Game game = new Game(dice, winnerPrinter);
            Player playerFirst = new Player("Вася");
            Player playerSecond = new Player("Игорь");
            game.playGame(playerFirst, playerSecond);

            Assertions.assertEquals(1, actualFlow.size());
            boolean actualFlowFound = false;
            for (int i = 0; i < expectedFlow.size(); i++) {
                actualFlowFound = expectedFlow.get(i).equalsIgnoreCase(expectedFlow.get(0));
            }
            if (!actualFlowFound) throw new IllegalArgumentException("Not found expected " + expectedFlow.get(0) + " or " + expectedFlow.get(1));

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
