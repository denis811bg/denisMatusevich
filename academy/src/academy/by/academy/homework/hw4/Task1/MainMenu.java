package academy.by.academy.homework.hw4.Task1;

public class MainMenu {

    public static StringBuilder initMainMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---------------------------------------------------------------\n");
        stringBuilder.append("MENU:\n");
        stringBuilder.append("1. Задать дату.\n");
        stringBuilder.append("2. Вывести дату.\n");
        stringBuilder.append("3. Вывести на консоль день недели по заданной дате.\n");
        stringBuilder.append("4. Рассчитать количество дней, в заданном временном промежутке.\n");
        stringBuilder.append("5. Высокосный год или нет.\n");
        stringBuilder.append("0. Выход.\n");
        stringBuilder.append("---------------------------------------------------------------");
        return stringBuilder;
    }
}
