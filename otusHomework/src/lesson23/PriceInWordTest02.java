package lesson23;


import lesson23.assertions.Assertions;

import java.util.ArrayList;

public class PriceInWordTest02 {
    public void testPriceInWordTestForUSD(CurrencyInWord currencyInWord, String[] args) {
        String scenario = "V1. Тест по долларовой цене";
        try {
            String[] expected = {"0 долларов", "1 доллар", "2 доллара", "3 доллара", "4 доллара", "5 долларов", "6 долларов", "7 долларов"};

            ArrayList<String> actualArrayList = currencyInWord.getCurrencyInWordList("USD", args);
            for (int i=0; i<actualArrayList.size(); i++) {
                Assertions.assertEquals(expected[i], i + " " + actualArrayList.get(i));
            }

            Assertions.assertEquals(expected.length, actualArrayList.size());

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
