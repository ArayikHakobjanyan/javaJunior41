package lesson5;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[7][];

        int startJ = 3;
        int count = 2;
        for(int i = 0; i < nums.length; i++){
            for (int j = startJ; j < nums[i].length; j++ ){
                nums[i][j]=1;
            }

        if(i >= nums.length - 1 / 2){
            startJ--;
            count = count + 2;
        }else {
            startJ++;
            count = count - 2;
        }
        }
        System.out.println();
    }
}
