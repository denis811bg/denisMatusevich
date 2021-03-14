package academy.by.academy.homework.hw6;

import java.io.*;

/**
 * Создать руками текстовый файл, закинуть следующий текст:
 * Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
 */
public class Task2 {

    public static final String PATHNAME = "src/academy/by/academy/homework/hw6/Task2";

    public static void main(String[] args) {

        File file = new File(PATHNAME);
        if (!file.exists()) {
            file.mkdirs();
        }

        try (InputStream inputStream = new FileInputStream(new File(file, "Task2.txt"));
             OutputStream outputStream = new FileOutputStream(new File(file, "result.txt"))) {
            int readByte;
            while (inputStream.available() > 0) {
                readByte = inputStream.read();
                if (readByte != 32) {
                    outputStream.write(readByte);
                }
            }
        } catch (IOException message) {
            message.getStackTrace();
        }
    }

}
