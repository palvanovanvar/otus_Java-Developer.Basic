package lesson8;

import java.util.Objects;
import java.util.Scanner;

class Answer{
    private String[] variants;
    private int correct;

    public Answer(String[] variants, int correct) {
        this.variants = variants;
        this.correct = correct;
    }

    void Print(){
        for(int a = 0; a < variants.length; a++) {
            System.out.println((a+1) + ". " + variants[a]);
        }
    }

    boolean isCorrectAnswer(int enteredAnswer){
        return (this.correct == enteredAnswer);
    }
}
class Question{
    private String name;
    private Answer answers;
    private boolean answer_accepted;

    public Question(String name, Answer answers){
        this.name = name;
        this.answers = answers;
        this.answer_accepted = false;
    }

    void Print(){
        System.out.println(name);
        answers.Print();
    }

    void CheckAnswer(int enteredAnswer){
        if (answers.isCorrectAnswer(enteredAnswer)){
            System.out.println("Правильно");
            this.answer_accepted = true;
        } else {
            System.out.println("Неправильно");
        }
    }

    boolean getAnswerAccepted() {
        return this.answer_accepted;
    }
}
public class TestingSystem {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("Сколько месяцев в квартале", new Answer(new String[]{"один", "два", "три"}, 3)),
                new Question("Сколько кварталов в году", new Answer(new String[]{"один", "два", "три", "четыре"}, 4)),
                new Question("Сколько дней в неделе", new Answer(new String[]{"один", "два", "три", "пять", "семь"}, 5)),
        };

        Scanner scanner = new Scanner(System.in);
        String enteredAnswer;
        int correctCount = 0;

        for(int q = 0; q < questions.length; q++) {
            questions[q].Print();
            System.out.println("Выберите один из вариантов ответа указав его номер: ");
            enteredAnswer = scanner.nextLine();
            questions[q].CheckAnswer(Integer.parseInt(enteredAnswer));
            if (questions[q].getAnswerAccepted()){
                correctCount++;
            }
        }
        System.out.println("____________________________________________");
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + (questions.length-correctCount));
        }
}
