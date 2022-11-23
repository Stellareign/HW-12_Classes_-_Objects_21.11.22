public class Book { // класс
    String bookName;
    int pageAmount;
    String publishName;
    int publishYear;

    public Book(String bookName, int pageAmount, String publishName, int publishYear) { // конструктор
        this.bookName = bookName;
        this.pageAmount = pageAmount;
        this.publishName = publishName;
        this.publishYear = publishYear;
        System.out.print(bookName + ", ");
        System.out.print(pageAmount + " стр., ");
        System.out.print(publishName + ", ");
        System.out.println(publishYear + " г.");
        System.out.println("" +
                "");
    }
}
