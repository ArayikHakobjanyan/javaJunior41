package lesson5;

public class MathUtils {
    /** metodi stexcum
     * 1 - modifikator dostupa (bar vor@ sah,manum a metodi tesaneliutyun@)
     * public - hasanlei a proekti nersum
     * protected - hasaneli a menak tvyal papki mej u ira erexeqin
     * ______ (datarkutyun) - hasaneli a menak tvyal papki mej
     * private - hasaneli a menak ed classum
     *
     *
     * Vortex kareli a ogtagordzel (1.) Modificaktor dostup@
     *
     *  classic araj
     * metodic araj
     * -
     * -
     * 2. statick//publicic heto (grum enq te che)
     * 3. cuyc enq tali veradardzvox tip@ (kam VOID bar@ ete patasxan chi aknkalum)
     * 4. metodi anun@ (maqsimal korekt)
     * 5. mutqayin parametrer (en aranc inchi metod@ chi kareli anel)
     * misht klor pakagceri merj en grum() storaketov arandznanum en u cuyc en tali popoxakani tip@
     *6. tvyal metodi katarman marmin@
     */

    // stexcel metod vor@ erankyan makeres@ 3 koxmerov khashvi u cuyc kta console-um

    public static void squareTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    // (եռանկյան պարագիծը) metod@ erankayan paragic@ veradarcnum a
    public static int perimeterTriangle(int a, int b, int c){
        return a + b + c;

    }
    public static void squareArea(int a, int b, int c, int d){

        System.out.println(Math.sqrt(a * b * c * d));
    }
    public static void perimeterSquare(int a, int b, int c, int d){

        System.out.println(a + b + c + d);
    }
    public static void areaOval(int a, int b){
        double p = 3.14;
        System.out.println(p * a * b);
    }

    public static void perimeterOval (int a, int b){
        double p = 3.14;
        System.out.println(p * (a + b));
    }

    public static void areaCircle (int a){
        double p = 3.14;
        System.out.println(p * (a * a));
    }
    public static void perimetrCircle (int a){
        double p = 3.14;
        System.out.println(2 * p * a);
    }
    public static void areaTrapezoid (int a, int b, int h){
        int p =  h / 2;
        System.out.println((a+b) * p);

    }
    public static void perimeterTrapezoid (int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

}
