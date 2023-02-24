package ru.otus;

import ru.otus.game.*;
import ru.otus.tests.unit.*;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        new HomeWorkTest01().testDiceImplForNegativeInt();
        System.out.println("\n\n----------------------\n\n");

        new HomeWorkTest02().testDiceImplFor1To6Int();
        System.out.println("\n\n----------------------\n\n");

        new HomeWorkTest03().testDiceImplForNotEqual();
        System.out.println("\n\n----------------------\n\n");

        new HomeWorkTest04().testGameForPrintWinner();
    }
    
}