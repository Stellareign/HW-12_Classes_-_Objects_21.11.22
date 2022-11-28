import java.time.LocalDate;
import java.util.Objects;

public class Book { // класс
    private final Author author; // так же final по "совету" Java
   private String bookName;
   private int pageAmount;
   private String publishName;
  private int publishYear;

    public Book(Author author, String bookName, int pageAmount, String publishName, int publishYear) { // конструктор
        this.author = author;
        this.bookName = bookName;
        this.pageAmount = pageAmount;
        this.publishName = publishName;
        this.publishYear = publishYear;

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
        System.out.println("Замена кол-ва страниц:");

    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
        System.out.println("Замена издательства:");

    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
        System.out.println("Замена года издания:");
        int currentYear = LocalDate.now().getYear();
        if (publishYear > currentYear)
            System.out.println("Ошибка: год издания не может быть больше текущего");
        return; // изменила сеттер, работал не совсем корректно, не выводил правильно изменённый год.
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        System.out.println("Сравнение книг: "); // хотела добиться, чтобы выводились разные сообщения при true и false, но не получилось. Этого вообще можно сделать здесь?
        return pageAmount == book.pageAmount && publishYear == book.publishYear && author.equals(book.author) && bookName.equals(book.bookName)
                && publishName.equals(book.publishName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, pageAmount, publishName, publishYear);
    }




    @Override
    public String toString() {
        return "Книга: " + author + ", " + bookName + ", " + pageAmount + " стр., " + publishName + ", " + publishYear + " г.";

    }
}
