package homework8;

public abstract class Tour {
    private String country;
    private int daysCount;
    private String transport;
    private int price;


    // конструкторы
    public Tour(){

    }
    public Tour(String country, int daysCount, String transport, int price){
        this.country = country;
        this.daysCount = daysCount;
        this.transport = transport;
        this.price = price;
    }

    public Tour(String country, int daysCount){
        this.country = country;
        this.daysCount = daysCount;
        this.transport = "не указан";
        this.price = 0;
    }
    public Tour(String country, int daysCount, int price){
        this.country = country;
        this.daysCount = daysCount;
        this.transport = "не указан";
        this.price = price;
    }

    //методы get
    public String getCountry(){
        return country;
    }
    public int getDaysCount(){
        return daysCount();
    }

    private int daysCount() {
        return 0;
    }

    public String getTransport(){
        return transport();
    }

    private String transport() {
        return null;
    }

    public int getPrice(){
        return price();
    }

    private int price() {
        return 0;
    }


    //методы set

    public void setCountry(String country){
        this.country = country;
    }
    public void setDaysCount(int daysCount){
        this.daysCount = daysCount;
    }
    public void setTransport(String transport){
        this.transport = transport;
    }
    public  void setPrice(int price){
        this.price = price;
    }


    // медот для ввывода информацию про Тур

    public void displayTourInfo() {
        System.out.println("страна" + " " + country);
        System.out.println("на" + " " + daysCount + " " + "дней");
        System.out.println("транспорт" + " " + transport);
        System.out.println("цена тура" + " " + price);
    }



}
