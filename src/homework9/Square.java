package homework9;

public class Square {
    private double a;

    public Square(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double calculateArea(){
        return a * a;
    }
    public double calculatePerimetr (){
        return a * 4;
    }
}
