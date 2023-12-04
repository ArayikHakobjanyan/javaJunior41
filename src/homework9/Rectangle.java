package homework9;

public class Rectangle {
    private double length;
    private  double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimetr(){
        return 2 * (length * width);
    }
}
