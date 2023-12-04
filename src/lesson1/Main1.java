package lesson1;

public class Main1 {
    public static void main(String[] args) {

        int widthOfTable = 3;
        int lengthOfTable = 5;
        int widthOfRoom = 34;
        int lengthOfRoom = 25;

        int ploshadTable = widthOfTable * lengthOfTable;
        int ploshadRoom = widthOfRoom * lengthOfRoom;

        int amountOfFitTables = ploshadRoom / ploshadTable;

        System.out.println(amountOfFitTables);


    }
}
