package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // Inchqan pox khanenq bankic ete dnenq
        // 10 mln 15 tarov 13%
        // amen amis kapitalizacia a linum

        double money = 10000000;
        for(int month = 0;month < 15 * 12;month++){
            money = money + ((money / 100*13)/12);
        }

        System.out.println(money);
        //69 553 093
        //69 553 640
    }
}
