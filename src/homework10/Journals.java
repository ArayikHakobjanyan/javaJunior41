package homework10;

public class Journals {
    private String name;
    private int year;
    private int number;
    private String publishingHouse;



    public Journals(String name, int year, int number, String publishingHouse) {
        this.name = name;
        this.year = year;
        this.number = number;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
