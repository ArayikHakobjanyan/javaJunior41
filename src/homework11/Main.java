package homework11;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("name", "Last Name", "group", 3.8);
        Aspirant aspirant = new Aspirant("aspirantName", "aspirantLastName", "aspirantGroup", 4.8, "rabota");


        Student [] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName + ": Scholarship - " + s.getScholarship() + " rubles");
        }
    }

}
