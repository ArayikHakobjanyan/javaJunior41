package homework9;

public class Oval {
    private double minorRadius;
    private double majorRadius;

    public Oval(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double calculateArea(){
        return 3.14 * majorRadius * minorRadius;
    }
    public double calculatePerimeter(){
        return 3.14 * (minorRadius + majorRadius);
    }
}
