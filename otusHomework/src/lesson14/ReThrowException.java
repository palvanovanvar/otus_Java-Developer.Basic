package lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReThrowException {
    public void CloseResource() throws IOException {
        try (FileReader fr = new FileReader("C:/CloseResource.txt");
             BufferedReader br = new BufferedReader(fr))
        {
            br.readLine();
        } catch (Exception e) {
            System.out.println("FileReader Error" + e.getMessage());
            throw e;
        }
    }
}
