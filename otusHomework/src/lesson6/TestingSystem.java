package lesson6;

import java.util.Objects;
import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        String[] questions = {"Сколько месяцев в квартале", "Сколько кварталов в году", "Сколько дней в неделе"};

        String[][] answerOptions = {
                {"один", "два", "три"},
                {"один", "два", "три", "четыре"},
                {"один", "два", "три", "пять", "семь"}
        };

        int[] correctAnswers = {3, 4, 5};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        String selectedAnswer;

        for(int q = 0; q < questions.length; q++) {
            System.out.println(questions[q] + "?");

            for(int a = 0; a < answerOptions[q].length; a++) {
                System.out.println((a+1) + ". " + answerOptions[q][a]);
            }

            System.out.println("Выберите один из вариантов ответа указав его номер: ");

            selectedAnswer = scanner.nextLine();

            if (Objects.equals(selectedAnswer, String.valueOf(correctAnswers[q]))) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
            System.out.println("____________________________________________");
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
