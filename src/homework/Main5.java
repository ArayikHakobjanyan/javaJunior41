package homework;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 20; i <= 60; i++) {
            if (i >= 30 && i <= 40) {
                continue;
            }
            System.out.println(i);
        }
    }
}
