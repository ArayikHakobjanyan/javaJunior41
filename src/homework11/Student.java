package homework11;


public class Student {

    String firstName;
    String lastName;
    String group;
    double avrageMark;


    public Student(String firstName, String lastName, String group, double avrageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avrageMark = avrageMark;
    }

    public double getScholarship(){
        return (avrageMark == 5)? 2000 : 1900;
    }

}
