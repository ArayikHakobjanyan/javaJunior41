package lesson11;

public class Journal  extends PrintEdition{

    private int numberOfYear;

    public Journal() {
    }

    public Journal(String name, int year, int pages, String izdatel, int numberOfYear) {
        super(name, year, pages, izdatel);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return numberOfYear == journal.numberOfYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfYear;
        return result;
    }

    @Override
    public String toString() {
        return "BookGirq{ nazvanie" +getName() + " , kolichistvo stranic: " + getPages() +
                "nomer vipuska: " + getNumberOfYear() + "izdatelstvo: " + getIzdatel() +
                " god vipuska: " + getYear() + "}";
    }
}
