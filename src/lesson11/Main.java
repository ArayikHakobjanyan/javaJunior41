package lesson11;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] edition =  new PrintEdition[6];
        edition[0] = new Book("Imya", 1950, 450, "izdatelstvo", "avtor");
        edition[1] = new Book("Imya 1 ", 1951, 32, "izdatelstvo 1 ", "avtor 1 ");
        edition[2] = new Book("Imya 2 ", 1952, 412, "izdatelstvo 2 ", "avtor 2 ");
        edition[3] = new Journal("Imya ", 2000, 15, "izdatel", 6);
        edition[4] = new Journal("Imya 1", 2012, 200, "izdatel1", 54);
        edition[5] = new Journal("Imya 2", 2021, 135, "izdatel2", 9);

    for (PrintEdition currentEdition : edition){
        System.out.println(currentEdition);
    }
    }
    public static void printBigestEdition(PrintEdition[] editions){
        // tnayin
    }
}
/*
* h** Полимартизм - это свойства java, работать с РАЗНЫМИ типами данных
 * как с ОДИНАКОВЫМ типом (в коде). Но в то же самая время в момент выялиения програаммы
 * программа будет работять как с РАЗНЫМИ Типами.
* */