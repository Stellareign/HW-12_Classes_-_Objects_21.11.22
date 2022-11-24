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
        System.out.print(getBookName() + ", ");
        System.out.print(getPageAmount() + " стр., ");
        System.out.print(getPublishName() + ", ");
        System.out.println(getPublishYear() + " г.");
        System.out.println("" +
                "");
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
        System.out.println(bookName +  " " + "Количество страниц: =" + pageAmount);
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
        System.out.println(bookName + " " + "Издательство = " + publishName);
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
        System.out.println(bookName +" " + "Год издания = " + publishYear); // а можно ли сюда подключить класс Author, и вызывать его в мэйне через Book?
    }
}
