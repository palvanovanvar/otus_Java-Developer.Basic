package ru.otus.tests.unit;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.util.List;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {
    private final List<String> actualFlow;

    public GameWinnerConsolePrinterSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(String.format("Победитель: %s%n", winner.getName()));
    }
}
