package lesson1;

public class Main2 {
    public static void main(String[] args) {

        int fullBalance = 1000;
        int priceOfSnikers = 35;
        double priceOfCandy = 3.5;


        double countOfSnikers = fullBalance / priceOfSnikers;
        double sumOfSnikers = countOfSnikers * priceOfSnikers;
        double balance = fullBalance - sumOfSnikers;
        double countOfCandy = (int) (balance / priceOfCandy);
        double finalSum = (int) (balance - (priceOfCandy * countOfCandy));



        System.out.println(finalSum);
        System.out.println(countOfCandy);
        System.out.println(countOfSnikers);
    }
}
