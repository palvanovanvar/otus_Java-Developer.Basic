package lesson23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CurrencyInWord {
    private Map<String, Map<Integer, String>> currencyInWordList = new HashMap<>();

    public CurrencyInWord() {
        this.currencyInWordList = new HashMap<>();
        Map<Integer, String> unitCurrency = new HashMap<>();
        unitCurrency.put(0,"рублей");
        unitCurrency.put(1,"рубль");
        unitCurrency.put(2,"рубля");
        unitCurrency.put(3,"рубля");
        unitCurrency.put(4,"рубля");
        unitCurrency.put(5,"рублей");
        unitCurrency.put(6,"рублей");
        unitCurrency.put(7,"рублей");
        unitCurrency.put(8,"рублей");
        unitCurrency.put(9,"рублей");
        unitCurrency.put(11,"рублей");
        unitCurrency.put(12,"рублей");
        unitCurrency.put(13,"рублей");
        unitCurrency.put(14,"рублей");
        this.currencyInWordList.put("RUB",unitCurrency);

        unitCurrency = new HashMap<>();
        unitCurrency.put(0,"долларов");
        unitCurrency.put(1,"доллар");
        unitCurrency.put(2,"доллара");
        unitCurrency.put(3,"доллара");
        unitCurrency.put(4,"доллара");
        unitCurrency.put(5,"долларов");
        unitCurrency.put(6,"долларов");
        unitCurrency.put(7,"долларов");
        unitCurrency.put(8,"долларов");
        unitCurrency.put(9,"долларов");
        unitCurrency.put(11,"долларов");
        unitCurrency.put(12,"долларов");
        unitCurrency.put(13,"долларов");
        unitCurrency.put(14,"долларов");

        this.currencyInWordList.put("USD",unitCurrency);
    }

    public String getCurrencyInWord(String currency, Integer unit) {
        String currencyInWord = new String();
        if (currency.equalsIgnoreCase("RUB") || currency.equalsIgnoreCase("USD")) {
            currencyInWord = currencyInWordList.get(currency).get(unit);
            if (currencyInWord == null) {
                currencyInWord = currencyInWordList.get(currency).get(Integer.parseInt(unit.toString().substring(unit.toString().length() - 2)));
            };
            if (currencyInWord == null) {
                currencyInWord = currencyInWordList.get(currency).get(Integer.parseInt(unit.toString().substring(unit.toString().length() - 1)));
            }
        } else {
            currencyInWord = currency + " валюта не найдена";
        };

        return currencyInWord;
    }

    public ArrayList<String> getCurrencyInWordList(String currency, String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i=0; i<args.length; i++) {
            stringArrayList.add(getCurrencyInWord(currency, Integer.parseInt(args[i])));
        }
        return stringArrayList;
    }
}
