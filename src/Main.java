public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 12, Классы и объекты. Задача 1:");
        Author author = new Author("Роджер Желязны");
        Book book = new Book(author, "Хроники Эмбера", 245, "Северо-Запад", 1992);
        Author author1 = new Author("Иван Ефремов");
        Book book1 = new Book(author1,"Час быка", 700, "Правда", 1985);
        Author author2 = new Author("Джером К. Джером");
        Book book2 = new Book(author2,"Трое в лодке, не считая собаки", 348, "Вышайшая школа", 1993);

        book2.setPageAmount(452);

        book.setPublishName("Юго-Восток");

        book1.setPublishYear(2203);
    }

}
