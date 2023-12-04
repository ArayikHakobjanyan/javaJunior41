package lesson10;

public class Main {

    public static void main(String[] args) {
        Student dasha = new Student("Ivanonva Dasha", 23, 20000);
        Student olya = new Student("Ivanonva Dasha", 23, 20000);

        System.out.println(dasha.equals(olya));
    }
}
