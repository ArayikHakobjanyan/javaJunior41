package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "140000 руб", "3 звезды", "Завтраки", tours);
        ToursUtils.addTour("Италия", "Флоренция", "Самолет",
                "4 дней", "40000 руб", "2 звезды","Завтраки+ ужин", tours);
        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "8 дней", "240000 руб", "5 звезды","Завтраки", tours);
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "180000 руб", "3 звезды","Завтраки", tours);
        ToursUtils.addTour("Италия", "Рим", "Автобус",
                "3 дней", "80000 руб", "4 звезды","Завтраки + Ужин", tours);
        ToursUtils.addTour("Германия", "Мюнхен", "Самолет",
                "6 дней", "220000 руб","4 звезды", "Завтраки", tours);
        ToursUtils.addTour("Италия", "Рим", "Автобус",
                "9 дней", "340000 руб", "5 звезды","Завтраки", tours);
        ToursUtils.addTour("Германия", "Берлин", "Самолет",
                "8 дней", "380000 руб", "5 звезды","Все включено", tours);

        ScannerUtils.searchByCountry(tours);
        ScannerUtils.searchByBudget(tours);

        /*
        * 1. - Вывести на консоль туры, которые на ... дней
        * 2. - Ввести на консоль туры, на ... звезд u ... транспортом
        * 3. - Вывести на консоль туры, ... страны и на ... бюджет
        * */




       /* Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать");
        String country = scanner.next();

        ToursUtils.printToursByCountry(tours,country);*/
    }

}