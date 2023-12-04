package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /** cragir@ ogtvoxic uzelu a consoleum gri patker
         * (erankyun, qarankyun, oval)
         * heto uzelu enq hamapatasxan texekutyun@ patkeri masin (koxmbardzrutyun ....)
         * heto dra vra himnvelov consoleum tpelu a makeres u paragic
         *
         * прогграма будет просить пользовотеля ввести с консоли фигуру
         * (триуголник, квадрат, овал,  круг, трапеция)
         * птом мы пользователя просим ввести нужные данные о фигуре (сторона, высота и т д)
         * и на основанни введенных данных печатаем  на консол площадь и периметр
         */

        System.out.println("выберите фигуру");
        System.out.println("1 - треуголник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");


        Scanner scanner = new Scanner(System.in); // keywoardic a kardum
        String inputFigure = scanner.next(); // tiv kam bar

        if(inputFigure.equals("1") || inputFigure.equalsIgnoreCase("треугольник")){ // ete @ntrum a erankyun
            System.out.println("ввидите сторону а:");
            int a = scanner.nextInt();
            System.out.println("ввидите сторону b:");
            int b = scanner.nextInt();
            System.out.println("ввидите сторону c:");
            int c = scanner.nextInt();

            System.out.println("Плошадь треуголника:");
            lesson5.MathUtils.squareTriangle(a, b, c);
            System.out.println("периметр треуголника;" + lesson5.MathUtils.perimeterTriangle(a, b, c));

        }
        if (inputFigure.equals("2") || inputFigure.equalsIgnoreCase(("квадрат"))) {
            System.out.println("ввидите сторону а:");
            int a = scanner.nextInt();
            System.out.println("ввидите сторону b:");
            int b = scanner.nextInt();
            System.out.println("ввидите сторону c:");
            int c = scanner.nextInt();
            System.out.println("ввидите сторону d:");
            int d = scanner.nextInt();

            System.out.println("Плошадь квадрата:");
            lesson5.MathUtils.squareArea(a, b, c, d);
            System.out.println("пириметр квадрата");
            lesson5.MathUtils.perimeterSquare(a, b, c, d);
        }

        if (inputFigure.equals("3") || inputFigure.equalsIgnoreCase(("овал"))) {
            System.out.println("ввидите сторону а:");
            int a = scanner.nextInt();
            System.out.println("ввидите сторону b:");
            int b = scanner.nextInt();

            System.out.println("площадь овала");
            lesson5.MathUtils.areaOval(a, b);
            System.out.println("периметр овала");
            lesson5.MathUtils.perimeterOval(a, b);

        }
        if (inputFigure.equals("4") || inputFigure.equalsIgnoreCase(("круг"))) {
            System.out.println("ввидите радиус а:");
            int a = scanner.nextInt();
            System.out.println("плошадь круга");
            lesson5.MathUtils.areaCircle(a);
            System.out.println("периметр круга");
            lesson5.MathUtils.perimetrCircle(a);

        }
        if (inputFigure.equals("5") || inputFigure.equalsIgnoreCase(("трапеция"))){
            System.out.println("ввидите сторону а:");
            int a = scanner.nextInt();
            System.out.println("ввидите сторону b:");
            int b = scanner.nextInt();
            System.out.println("ввидите сторону c:");
            int c = scanner.nextInt();
            System.out.println("ввидите сторону d:");
            int d = scanner.nextInt();
            System.out.println("ввидите высоту h");
            int h = scanner.nextInt();

            System.out.println("плошадь трапеции");
            lesson5.MathUtils.areaTrapezoid(a, b, h);
            System.out.println("периметр трапеции");
            lesson5.MathUtils.perimeterTrapezoid(a, b, c, d);
        }
    }
}
