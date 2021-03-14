package academy.by.academy.homework.hw6;

import java.io.*;
import java.util.Random;

/**
 * Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
 * Считываем текст из 2-ого задания, получаем его длинну (576 символов).
 * Для каждого файла генерируем рандомное число от 0 до 576,
 * достаем из текста (из 2 задания) такое-же количество символов (string.substring())
 * и сохраняем в наш файл. Создайте файл result.txt и запишите туда список всех файлов и их размеры.
 */
public class Task4 {

    public static final String PATHNAME = "src/academy/by/academy/homework/hw6/Task4";
    public static final String FILENAME = "result.txt";
    public static final String PATHNAME_RESOURCE = "src/academy/by/academy/homework/hw6/Task2";
    public static final String FILENAME_RESOURCE = "Task2.txt";
    public static final Random random = new Random();

    public static void main(String[] args) {

        File file = new File(PATHNAME);
        if (!file.exists()) {
            file.mkdirs();
        }

        String inputLine;
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(PATHNAME_RESOURCE, FILENAME_RESOURCE)))) {
            while ((inputLine = bufferedReader.readLine()) != null) {
                text.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bufferedWriterResult = null;
        try {
            bufferedWriterResult = new BufferedWriter(new FileWriter(new File(PATHNAME, FILENAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            File fileOutput = new File(PATHNAME, (i + 1) + ".txt");

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutput))) {
                bufferedWriter.write(text.substring(0, random.nextInt(text.length() + 1)));
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (bufferedWriterResult != null) {
                try {
                    bufferedWriterResult.write(fileOutput.getName() + " - " + fileOutput.length() + " bytes\n");
                    bufferedWriterResult.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            if (bufferedWriterResult != null) {
                bufferedWriterResult.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
