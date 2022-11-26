import java.time.LocalDate;
public class Book { // класс
    public final Author author; // так же final по "совету" Java
    String bookName;
    int pageAmount;
    String publishName;
    int publishYear;

    public Book(Author author, String bookName, int pageAmount, String publishName, int publishYear) { // конструктор
        this.author = author;
        this.bookName = bookName;
        this.pageAmount = pageAmount;
        this.publishName = publishName;
        this.publishYear = publishYear;
        System.out.println(getBookName() + ", "+ getPageAmount() + " стр., " + getPublishName() + ", " + getPublishYear() + " г.");
        // хотелось вывод на печать автора прописать здесь же
        System.out.println("" +
                ""); // да, здесь затупила сначала, можно ж было всё в одной строке написать
    }
    public Author getAuthor() {
        return this.author;
    }

    public String getBookName() {

        return this.bookName;
    }

    public int getPageAmount() {

        return this.pageAmount;
    }

    public String getPublishName() {

        return this.publishName;
    }

    public int getPublishYear() {
        return this.publishYear;
    }



    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;

        System.out.println(author + ": " + bookName + ", " + pageAmount + ", " + publishName + ", " + publishYear+ " г.");
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
        System.out.println(author + ": "+ bookName + ", " + pageAmount + ", " + publishName + ", " + publishYear+ " г.");
    }

    public void setPublishYear(int publishYear) {
    int currentYear = LocalDate.now().getYear();
        if (publishYear > currentYear) {
            System.out.println(author + ": " + bookName + ", " + pageAmount + ", " + publishName + ", " + "Ошибка: год издания не может быть больше текущего");
            return;
        }
        System.out.println(author + ": " + bookName + ", " + pageAmount + ", " + publishName + ", " + publishYear + " г.");
    }
}
//