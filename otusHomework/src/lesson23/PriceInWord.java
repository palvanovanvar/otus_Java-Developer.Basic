package lesson23;


import java.util.ArrayList;

public class PriceInWord {
    public static void main(String[] args) {

        System.out.println("RUB");
        CurrencyInWord currencyInWord = new CurrencyInWord();
        ArrayList<String> stringArrayList = currencyInWord.getCurrencyInWordList("RUB", args);
        for (int i=0; i<stringArrayList.size(); i++) {
            System.out.println(args[i] + " " + stringArrayList.get(i));
        }

        System.out.println("");
        System.out.println("USD");
        stringArrayList = currencyInWord.getCurrencyInWordList("USD", args);
        for (int i=0; i<stringArrayList.size(); i++) {
            System.out.println(args[i] + " " + stringArrayList.get(i));
        }

        System.out.println("");
        System.out.println("EUR");
        stringArrayList = currencyInWord.getCurrencyInWordList("EUR", args);
        for (int i=0; i<stringArrayList.size(); i++) {
            System.out.println(args[i] + " " + stringArrayList.get(i));
        }
    }
}
