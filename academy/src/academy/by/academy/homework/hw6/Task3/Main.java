package academy.by.academy.homework.hw6.Task3;

import java.io.*;
import java.util.ArrayList;

/**
 * Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
 * В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
 * Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
 * Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
 * Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
 */
public class Main {

    public static final String PATHNAME = "src/academy/by/academy/homework/hw6/Task3/users";

    public static void main(String[] args) {

        File file = new File(PATHNAME);
        if (!file.exists()) {
            file.mkdirs();
        }

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Den", "Black", 1));
        arrayList.add(new User("Den", "White", 2));
        arrayList.add(new User("Den", "Orange", 3));
        arrayList.add(new User("Den", "Brawn", 4));
        arrayList.add(new User("Den", "Red", 5));
        arrayList.add(new User("Den", "Green", 6));
        arrayList.add(new User("Den", "Grey", 7));
        arrayList.add(new User("Den", "Yellow", 8));
        arrayList.add(new User("Den", "Blue", 9));
        arrayList.add(new User("Den", "Purple", 10));

        for (User user : arrayList) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(
                    new File(file, user.getFirstName() + "_" + user.getLastName())))) {
                objectOutputStream.writeObject(user);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
