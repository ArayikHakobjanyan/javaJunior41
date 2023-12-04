package homework3;

public class Main1 {
    public static void main(String[] args) {
        // consoleum berel shaxmati taxtak 0nerov u mekerov
        int[][] nums = new int[8][8];

        for (int i = 0 ; i < nums.length; i++) {// toxern a
            for (int j = 0; j < nums[i].length; j++) { // syunakn a
                if (i >= j)  { // payman enq tali vor hatuk depqum tpi
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " "); // hakarak depqum chtpi kam tpi vochmiban
                }
            }
            System.out.println();
        }

    }
}
