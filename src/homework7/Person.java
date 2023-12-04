package homework7;

public class Person {
    public String fullName;
    public int age;

    public Person(){
        this.age = 0;
        this.fullName = "   ";

    }


    public Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
    }
public void move(){
    System.out.println(fullName + "двигается");
}
public void talk(){
    System.out.println(fullName + "говорит");
}

}
