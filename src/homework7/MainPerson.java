package homework7;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("gago", 6);
        Person person2 = new Person("gugo", 20);
        Person person3 = new Person("koko", 43);



        person1.move();
        person1.talk();

        person2.talk();
        person2.move();

        person3.move();
        person3.talk();
    }
}
