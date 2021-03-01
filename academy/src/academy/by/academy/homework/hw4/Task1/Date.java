package academy.by.academy.homework.hw4.Task1;

import academy.by.academy.homework.hw4.Task1.DayOfWeek.DayOfWeek;
import academy.by.academy.homework.hw4.Task1.Validator.Validator;

import java.util.Calendar;

/**
 * Создать объект класса Date, используя вложенные классы Год, Месяц, День.
 * Методы: задать дату, вывести на консоль день недели по заданной дате.
 * День недели представить в виде перечисления.
 * Рассчитать количество дней, в заданном временном промежутке.
 * Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
 * После валидации в конструкторе создаем объекты класса Year, Month, Day.
 * Добавить метод, который проверяет высокосный ли год или нет.
 */
public class Date {

    public static final Validator validator = new Validator();
    private Date date;
    private Day day;
    private Month month;
    private Year year;

    public Date() {
        super();
    }

    public Date(Day day, Month month, Year year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String str) {
        super();
        if (validator.validate(str)) {
            String[] date = str.split("-");
            day = new Day(Integer.parseInt(date[0]));
            month = new Month(Integer.parseInt(date[1]));
            year = new Year(Integer.parseInt(date[2]));
            this.date = new Date(day, month, year);
        }
    }

    public Date getDate() {
        return date;
    }

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public Year getYear() {
        return year;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public static Date initDate() {
        Date date;
        while (true) {
            date = new Date(Application.scanner.nextLine());
            if (date.getDate() != null) {
                if (date.getYear().borderYear() && date.getMonth().borderMonth() && date.getDay().borderDay()) {
                    System.out.println("Дата установлена.\n" + date.toString());
                } else {
                    System.out.println("Вы ввели некорректные границы даты.");
                }
                break;
            } else {
                System.out.print("Дата не соответствует шаблону dd-mm-yyyy. Задать дату: ");
            }
        }
        return date;
    }

    public static int daysBetween(java.util.Date date1, java.util.Date date2) {
        return (int) ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("День: ").append(date.getDay().getDay()).append("\n");
        stringBuilder.append("Месяц: ").append(date.getMonth().getMonth()).append("\n");
        stringBuilder.append("Год: ").append(date.getYear().getYear());
        return stringBuilder.toString();
    }

    public class Year {

        private int year;

        public Year(int year) {
            super();
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public boolean borderYear() {
            return year < 10000 && year > 0;
        }

        public boolean isLeapYear() {
            if (year < 1582) {
                return (year % 4 == 0);
            } else return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
    }

    public class Month {

        private int month;

        public Month(int month) {
            super();
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public boolean borderMonth() {
            return month > 0 && month < 13;
        }
    }

    public class Day {

        private int day;

        public Day(int day) {
            super();
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public boolean borderDay() {
            switch (Date.this.getMonth().getMonth()) {
                case 1, 3, 5, 7, 8, 10, 12: {
                    return day <= 31;
                }
                case 2: {
                    if (Date.this.getYear().isLeapYear()) {
                        return day <= 29;
                    }
                    return day <= 28;
                }
                case 4, 6, 9, 11: {
                    return day <= 30;
                }
                default: {
                    return false;
                }
            }
        }


        public int dayOfWeekNumber() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(date.getYear().getYear(),
                    date.getMonth().getMonth() - 1,
                    date.getDay().getDay());
            return calendar.get(Calendar.DAY_OF_WEEK);
        }

        public String dayOfWeekValue() {
            switch (dayOfWeekNumber()) {
                case 1: {
                    return String.valueOf(DayOfWeek.SUNDAY);
                }
                case 2: {
                    return String.valueOf(DayOfWeek.MONDAY);
                }
                case 3: {
                    return String.valueOf(DayOfWeek.TUESDAY);
                }
                case 4: {
                    return String.valueOf(DayOfWeek.WEDNESDAY);
                }
                case 5: {
                    return String.valueOf(DayOfWeek.THURSDAY);
                }
                case 6: {
                    return String.valueOf(DayOfWeek.FRIDAY);
                }
                case 7: {
                    return String.valueOf(DayOfWeek.SATURDAY);
                }
                default: {
                    return null;
                }
            }
        }

    }
}
