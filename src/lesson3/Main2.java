package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // masiv unenq petqa tpel menak zuyger@ hakarak hertakanutyamb

        int[] numbers = {3, 5, 7, 2, 1, 4, 6, 1, 4, 6, 2, 8};

        for(int i = numbers.length - 1; i >= 0; i--){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }

        }
    }
}
