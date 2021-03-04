package academy.by.academy.homework.hw5;

/*
 * Можно писать все в main. Не нужно создавать новых классов.
 * Имеется текст. Следует составить для него частотный словарь:
 * Создать Map<Character, Integer> для символов, в который мы заносим символ
 * и его количество.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine().replaceAll("[^a-zA_Zа-яёА-ЯЁ]", "").toLowerCase();
        Map<Character, Integer> map = mapString(inputString.toCharArray());

        for (Map.Entry<Character, Integer> tmpMap : map.entrySet()) {
            System.out.println(tmpMap.getKey() + " - " + tmpMap.getValue());
        }

        scanner.close();
    }

    public static Map<Character, Integer> mapString(char[] charArray) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character character : charArray) {
            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }

        return map;
    }
}
