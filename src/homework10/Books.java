package homework10;

public class Books {
    public String name;
    public String writer;
    public int year;
    public int count;
    public String publishingHouse;

    public Books(String name, String writer, int year, int count, String publishingHouse) {
        this.name = name;
        this.writer = writer;
        this.year = year;
        this.count = count;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }

    public int getCount() {
        return count;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
