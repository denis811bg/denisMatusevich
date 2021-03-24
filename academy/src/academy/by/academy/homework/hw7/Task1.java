package academy.by.academy.homework.hw7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
 * Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
 * Пропустив первые 3 числа произвести следующие операции:
 * Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).
 */

public class Task1 {

    public static final int RANDOM = 100;

    public static void main(String[] args) {

        ArrayList<Long> arrayList = (ArrayList<Long>) Stream.generate(() -> new Random().nextInt(RANDOM + 1)).limit(100)
                .map(value -> (long) (value * Math.PI - 20)).filter(value -> value < 100).sorted().collect(Collectors.toList());

        for (Long value : arrayList) {
            System.out.print(value + " ");
        }
        System.out.println();

        Map<Long, String> map = arrayList.stream().skip(3).distinct().collect(Collectors.toMap(key -> key, value -> "Number: " + value));
        for (Map.Entry<Long, String> tmpMap : map.entrySet()) {
            System.out.println(tmpMap.getKey() + " - " + tmpMap.getValue());
        }
    }
}
