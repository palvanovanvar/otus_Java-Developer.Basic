package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        final int countElements = 10;
        int[] intList = new int[countElements];
        System.out.println("_________________Array int________________________________");
        for(int i = 0; i < countElements; i++){
            intList[i] = (int) (Math.random()*100);
             System.out.print(intList[i] + " ");
        }

        System.out.println("");

        for (int i = 0; i < countElements; i++){
            int minElement = intList[i], jIndex = i;
            for (int j = i+1; j<countElements; j++){
                if (minElement > intList[j]){
                    minElement = intList[j];
                    jIndex = j;
                }
            }
            intList[jIndex] = intList[i];
            intList[i] = minElement;
        }
        System.out.println("____________sort Array int________________________________");
        for (int i = 0; i < countElements; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println("");

        System.out.println("__________________________________________________________");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            list.add((int) (Math.random()*100));
        }

        System.out.println("____________ArrayList Integer_____________________________");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("");

        for (int i = 0; i < list.size(); i++){
            int minElement = list.get(i), jIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                if (minElement > list.get(j)){
                    minElement = list.get(j);
                    jIndex = j;
                }
            }
            list.set(jIndex, list.get(i));
            list.set(i, minElement);
        }
        System.out.println("___________sort ArrayList Integer_________________________");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");

        ArrayList<Integer> listDelta  = new ArrayList<>(), listDeltaJava = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            listDelta.add((int) (Math.random()*100));
            listDeltaJava.add((int) (Math.random()*100));
        }

        System.out.println("__________________________________________________________");
        long start = new Date().getTime();
        for (int i = 0; i < listDelta.size(); i++){
            int minElement = listDelta.get(i), jIndex = i;
            for (int j = i + 1; j < listDelta.size(); j++){
                if (minElement > listDelta.get(j)){
                    minElement = listDelta.get(j);
                    jIndex = j;
                }
            }
            listDelta.set(jIndex, listDelta.get(i));
            listDelta.set(i, minElement);
        }
        long end = new Date().getTime();
        System.out.println("sort time delta listDelta " + (end - start));

        start = new Date().getTime();
        Collections.sort(listDeltaJava);
        end = new Date().getTime();
        System.out.println("sort time delta listDeltaJava " + (end - start));
    }
}