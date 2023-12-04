package lesson4;

public class Main1 {
    public static void main(String[] args) {
        // stexcel erdasht tveri massiv, u consoleum grel
        int [] [] numbers = {{2,5,6}, // 0
                            {3,5,7}, // 1
                            {8,9,0}, // 2
                            {1,3,6}}; //3 indexner

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
