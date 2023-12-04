package homework10;


public class Main {


        public static void main(String[] args) {

            Object[] Main = new Object[3];


            Main[0] = new Books("книга 1 ", "писател 1 ", 2019, 1248, "издательство 1 ");
            Main[1] = new Journals("журнал 1 ", 2023, 4, "издательство ");
            Main[2] = new Books("книга 2 ", "писател 2 ", 1994, 395, "издательство 2 ");


            for (Object printedMaterial : Main) {
                if (printedMaterial instanceof Books) {
                    Books book = (Books) printedMaterial;
                    System.out.println("Book - Title: " + book.getName() + " , Publisher: " + book.getPublishingHouse() +
                            " , Author: " + book.getWriter() + " , Year: " + book.getYear() +
                            " , Page Count: " + book.getCount());
                } else if (printedMaterial instanceof Journals) {
                    Journals journal = (Journals) printedMaterial;
                    System.out.println("Journal - Title: " + journal.getName() + " , Publisher: " + journal.getPublishingHouse() +
                            " , Year: " + journal.getYear() + " , Issue Number: " + journal.getNumber());
                }
            }
        }
    }
