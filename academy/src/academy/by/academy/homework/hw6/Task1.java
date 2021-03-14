package academy.by.academy.homework.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
 * если введена "stop" строка тогда закончить запись в файл.
 */
public class Task1 {

    public static final String PATHNAME = "src/academy/by/academy/homework/hw6/Task1";

    public static void main(String[] args) {

        File file = new File(PATHNAME);
        if (!file.exists()) {
            file.mkdirs();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(file, "Task1.txt")))) {
            String line;
            while (!"stop".equals(line = bufferedReader.readLine())) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException message) {
            message.printStackTrace();
        }

    }
}
