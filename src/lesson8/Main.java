package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры:");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");


        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine(); // text "1" if "Новичок"


        SapyorField sapyorField = new SapyorField(level);

        sapyorField.addRandomMins();
        sapyorField.countAndAddNums();
        sapyorField.printField();

        while(sapyorField.doStep()){ // kam hajord qayln a kam krvel es
                sapyorField.printField();
        }
    }
}