package lesson7;

public class Student {
    /*
    * 1 - переменные, ила(/) поля класса, или(/) свойства sranq sax nuynn en
    * 2 - конструктор (особый метод, который вызывается в момент создания объекта после слова пе)
    * 3 - методы
    * */

    private int age;
    private String fullName;
    private String address;
    private String phoneNumber;


    public Student(){

    }

    public Student(int age, String fullName, String address, String phoneNumber){
        this.age = age;
        this.address = address;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }


    // метод будет устанавливать студенту возраст
    public void setAge(int age){
        // this -~ обращение "я"
        this.age = age;
    }
    // узнать возврат
    public int getAge(){
        return this.age;
    }
}
