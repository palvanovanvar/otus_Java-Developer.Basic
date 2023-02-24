package lesson23;


import lesson23.assertions.Assertions;

import java.util.ArrayList;

public class PriceInWordTest01 {
    public void testPriceInWordTestForRUB(CurrencyInWord currencyInWord, String[] args) {
        String scenario = "V1. Тест по рублевой цене";
        try {
            String[] expected = {"0 рублей","1 рубль","2 рубля","3 рубля","4 рубля","5 рублей","6 рублей","7 рублей"};

            ArrayList<String> actualArrayList = currencyInWord.getCurrencyInWordList("RUB", args);
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
