package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // tveri massive tpel consoleum
        // tpel aj harevanin ete yacheyken 3i bazmapatik a


        int[] numbers = {45, 45, 3, 2, 7, 4, 3, 8, 5, 8};

        for(int i = 0; i < numbers.length; i++){
            if(i != numbers.length -1){ // erb ka ajic harevan
                if(numbers[i] % 3 == 0){ // stugum a 3i bazmapatika te che
                    System.out.println(numbers[i + 1]);
                }
            }

        }
    }
}
