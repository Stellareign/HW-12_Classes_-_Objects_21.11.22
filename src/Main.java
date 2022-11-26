public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 12, Классы и объекты. Задача 1:");
        Author author1 = new Author("Роджер Желязны");
        Book book1 = new Book(author1, "Хроники Эмбера", 245, "Северо-Запад", 1992);
        Author author2 = new Author("Иван Ефремов");
        Book book2 = new Book(author2,"Час быка", 700, "Правда", 1985);
        Author author3 = new Author("Джером К. Джером");
        Book book3 = new Book(author3,"Трое в лодке, не считая собаки", 348, "Вышайшая школа", 1993);
        Book book4 = new Book(new Author("Аркадий и Борис Стругацкие"), "Понедельник начинается в субботу",
                523, "Союзпечать", 1988);

        book3.setPageAmount(452);

        book1.setPublishName("Юго-Восток");

        book2.setPublishYear(2203);
    }

}
