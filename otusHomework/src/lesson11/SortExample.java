package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        final int countElements = 10;
        int[] intList = new int[countElements];
        System.out.println("____________ intList ________________________________");
        for(int i = 0; i < countElements-1; i++){
            intList[i] = (int) (Math.random()*100);
             System.out.print(intList[i] + " ");
        }

        System.out.println("");

        for (int i = 0; i < countElements-1; i++){
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
        System.out.println("____________ sort intList ________________________________");
        for (int i = 0; i < 10; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println("");

        System.out.println("_________________________________________");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            list.add((int) (Math.random()*10000));
        }
        long start = new Date().getTime();
        Collections.sort(list);
        long end = new Date().getTime();
        System.out.println("sort time delta " + (end - start));
    }
}