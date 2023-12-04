package lesson2;

public class Main3 {
    public static void main(String[] args) {
        // unenq erankyan 3 koxm petqa dus berenq havasarakoxm anhavasarakoxm u havasarachap

        // karavarox konstrukcia - if else


        int a =5;
        int b = 7;
        int c = 7;

        if(a == b && b == c && c == a) {
            System.out.println("раВностар");
        }
    else {
            if (a != b && b != c && c != a) {
                System.out.println("раЗностар");
            }
        }

        if ( (a ==b && b != c && c != a) || (a != b && b != c && c == a) || (a !=b && b == c && c != a) ){
            System.out.println("равнобедр");
        }
    }
}
