package lesson23;


import java.util.ArrayList;

public class PriceInWordTest {
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        CurrencyInWord currencyInWord = new CurrencyInWord();

        new PriceInWordTest01().testPriceInWordTestForRUB(currencyInWord, args);
        System.out.println("\n\n----------------------\n\n");

        new PriceInWordTest02().testPriceInWordTestForUSD(currencyInWord, args);
        System.out.println("\n\n----------------------\n\n");

    }
}
