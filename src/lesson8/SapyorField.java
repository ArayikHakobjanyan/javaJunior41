package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SapyorField {
    private int [][] fieldWithMins; // toxum enq datark vorovhetev chgitenq te inchqan tox u syunak klini
    private int countMins = 0; // nuyn verevi commente
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public SapyorField(String level){
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")){
            fieldWithMins = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean [9 + 2][9 + 2];
            countMins = 10;
            countClosedCellsToWin = countMins + ((9 + 9) * 2) + 4;
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")){
            fieldWithMins = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean [16 + 2][16 + 2];
            countMins = 40;
            countClosedCellsToWin = countMins + ((16 + 16) * 2) + 4;
        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")){
            fieldWithMins = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean [16 + 2][32 + 2];
            countMins = 99;
            countClosedCellsToWin = countMins + ((16 + 32) * 2) + 4;
        }
        if (level.equals("4") || level.equalsIgnoreCase("Особый")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ввидите количиство строк");
            int row = scanner.nextInt();

            System.out.println("ввидите количиство колонок");
            int col = scanner.nextInt();

            System.out.println("ввидите количиство мин");
            countMins = scanner.nextInt();

            fieldWithMins = new int[row + 2][col + 2];
            fieldToOpen = new boolean [row + 2][col + 2];
            countClosedCellsToWin = countMins + ((row + col) * 2) + 4;
        }

    }


    public void addRandomMins(){
        for (int i = 0; i < countMins; i++){
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMins.length -1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMins[0].length -1);
            if (fieldWithMins[row][col] != -1){
                fieldWithMins[row][col] = -1;
            }else {
                i--;
            }
        }
    }


    public void countAndAddNums(){
        for(int i = 0; i < fieldWithMins.length; i++){
            for(int j = 0; j < fieldWithMins[0].length; j++){
                // заполняем всех соседей +1 к числу, если в клеточке мина
                if(fieldWithMins[i][j] == -1){
                    if(fieldWithMins[i - 1][j - 1] != -1){
                        fieldWithMins[i - 1][j - 1] = fieldWithMins[i - 1][j - 1] + 1;
                    }
                    if(fieldWithMins[i - 1][j] != -1){
                        fieldWithMins[i - 1][j] = fieldWithMins[i - 1][j] + 1;
                    }
                    if(fieldWithMins[i - 1][j + 1] != -1){
                        fieldWithMins[i - 1][j + 1] = fieldWithMins[i - 1][j + 1] + 1;
                    }
                    if(fieldWithMins[i + 1][j + 1] != -1){
                        fieldWithMins[i + 1][j + 1] = fieldWithMins[i + 1][j + 1] + 1;
                    }
                    if(fieldWithMins[i][j - 1] != -1){
                        fieldWithMins[i][j - 1] = fieldWithMins[i][j - 1] + 1;
                    }
                    if(fieldWithMins[i + 1][j] != -1){
                        fieldWithMins[i + 1][j] = fieldWithMins[i + 1][j] + 1;
                    }
                    if(fieldWithMins[i][j + 1] != -1){
                        fieldWithMins[i][j + 1] = fieldWithMins[i][j + 1] + 1;
                    }

                }
            }
        }
        }
        public void printField(){
            System.out.println("------- ваше поле ------");
            for (int i = 1; i < fieldWithMins.length -1; i++){
                for (int j = 1; j < fieldWithMins.length -1; j++){
                    if(fieldToOpen[i][j] == true){ // ete kletken bac a
                        System.out.print(fieldWithMins[i][j] + " ");
                    }else{ // ete kletken pak a
                        System.out.print("X ");
                    }
                }

                System.out.println();
            }
        }

    public void printFieldEndGame(){
        System.out.println("------- ваше поле ------");
        for (int i = 1; i < fieldWithMins.length -1; i++){
            for (int j = 1; j < fieldWithMins.length -1; j++){
                if(fieldToOpen[i][j] == true || fieldWithMins[i][j] == -1){ // ete kletken bac a kam min ka
                    System.out.print(fieldWithMins[i][j] + " ");
                }else{ // ete kletken pak a
                    System.out.print("X ");
                }
            }

            System.out.println();
        }
    }


        public boolean doStep() {

            if(countClosedCellsToWin == this.countClosedCells()) {
                System.out.println(" ----ВЫ ВЫИГРАЛИ!!!");
                this.printFieldEndGame();
                return false;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("выбери строку: ");
            int row = scanner.nextInt();

            System.out.println("выбери колонку:");
            int col = scanner.nextInt();


            if (row <= 0 || row > fieldWithMins.length - 1 || col <= 0 || col > fieldWithMins[0].length - 1) {// ete incorrect index a
                System.out.println("повторите ввод!!! неверные индексы");
                this.doStep(); // rekursiv metodi kanchel
            }

            if(fieldToOpen[row] [col] == true){ // stugum a bacac yacheyken chntres
                System.out.println("уже открыли повторите ввод");
                this.doStep();

            }




            if (fieldWithMins[row][col] == -1) {
                System.out.println("проиграл");
                this.printFieldEndGame();
                return false; // patasxanum a vor mi hat el qayl el petq chi
            } else {// ete min chka u petqa sharunakel xax@
                fieldToOpen[row][col] = true;
                return true; // patasxanum a vor eli a petq qayl katari
            }

        }

        private int countClosedCells(){
        int count = 0;
            for(int i = 0; i < fieldToOpen.length; i++){
                for(int j = 0; j < fieldToOpen.length; j++){
                    if (fieldToOpen[i][j] == false){
                        count++;

                    }
                }

            }
            return count;
        }

}