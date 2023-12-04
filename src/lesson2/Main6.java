package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // tpel 30 ic 3000 tver@ vor bajanvum en 3-i 6-i u 15-i

        for(int i = 30; i <= 3000; i++){
            if( i % 3 == 0 && i % 6 == 0 && i % 15 ==0){
                System.out.println(i);
            }
        }
    }
}
