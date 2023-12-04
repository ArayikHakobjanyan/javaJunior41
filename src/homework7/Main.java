package homework7;

public class Main {
    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone(123-456-789, "iPhone X", "150");
        Phone phone2 = new Phone(987-654-321, "Samsung Galaxy");
        Phone phone3 = new Phone();

        // Выводим значения переменных для каждого объекта
        System.out.println("Phone 1 - Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2 - Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3 - Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        // Вызываем метод receiveCall для каждого объекта
        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");
    }
}
