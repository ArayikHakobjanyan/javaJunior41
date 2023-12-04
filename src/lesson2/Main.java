package lesson2;

public class Main {
    public static void main(String[] args) {
        int money = 1000;
        int costOfSnikers = 35;
        double costOfCandy = 3.5;

        int countCanSnikBy = money / costOfSnikers;
        int rest = money % costOfSnikers;
        int countCanCandBy = (int) (rest / costOfCandy);
        double totalRest = rest - (countCanCandBy * costOfCandy);

        System.out.println(countCanSnikBy);
        System.out.println(countCanCandBy);
        System.out.println(totalRest);
    }


}
