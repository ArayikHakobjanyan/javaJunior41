package homework11;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double avrageMark, String scientificWork) {
        super(firstName, lastName, group, avrageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (avrageMark == 5) ? 2500 : 2200;
    }
}
