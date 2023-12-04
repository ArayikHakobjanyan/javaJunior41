
package homework2;

public class Main3 {
    public static void main(String[] args) {
        int [] numbers = {3,5,8,3,55,4,1,65,36,98};

        for (int number : numbers){
            String numberStr = Integer.toString(number);
            if (numberStr.contains("5")){
                System.out.println(number);
            }
        }


    }
}
