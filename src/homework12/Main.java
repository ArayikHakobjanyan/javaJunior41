package homework12;

public class Main{
    public static void main(String[] args) {
        Hen hen = HenFactory.getHеn("Беларусь");
        hen.getCountOfEggsPerMonth();
        System.out.print(hen.getDescription());
        System.out.println();
        System.out.println();
    }
}