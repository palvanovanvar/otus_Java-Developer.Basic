package lesson14;

import java.util.Random;

public class HelloWorld {
    public void PrintHelloWorlds() throws TestException {
        int random = (int) (Math.random() * 5);
        if (random == 0) {
            System.out.println("HelloWorld ! HelloWorld ! HelloWorld !");
        } else {
            TestException te = new TestException(33, "random="+random);
            throw te;
        }

    }
}
