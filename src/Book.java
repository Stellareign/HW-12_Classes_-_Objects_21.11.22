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
        System.out.print(setBookName() + ", ");
        System.out.print(setPageAmount() + " стр., ");
        System.out.print(setPublishName() + ", ");
        System.out.println(setPublishYear() + " г.");
        System.out.println("" +
                "");
    }
    public String setBookName() {
        return this.bookName;
    }
    public int setPageAmount() {
        return this.pageAmount;
    }
    public String setPublishName() {
        return this.publishName;
    }
    public int setPublishYear() {
        return this.publishYear;
    }
}
