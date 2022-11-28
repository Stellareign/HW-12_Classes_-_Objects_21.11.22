public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 12, Классы и объекты. Задача 1:");
        Author author1 = new Author("Роджер", "Желязны");
        Book book1 = new Book(author1, "Хроники Эмбера", 245, "Северо-Запад", 1992);
        System.out.println(book1);
        System.out.println("" +
                "");
        Author author2 = new Author("Иван", "Ефремов");
        Book book2 = new Book(author2,"Час быка", 489, "Правда", 1970);
        System.out.println(book2);
        System.out.println("" +
                "");
        Author author3 = new Author("Джером", "К. Джером");
        Book book3 = new Book(author3,"Трое в лодке, не считая собаки", 348, "Вышайшая школа", 1993);
        System.out.println(book3);
        System.out.println("" +
                "");
        Author author4 = new Author("Иван", "Ефремов");
        Book book4 = new Book(author4, "Час быка", 512, "Эксмо", 2022);
        System.out.println(book4);
        System.out.println("" +
                "");
        Book book5 = new Book(new Author("Джером", "К. Джером"),"Трое в лодке, не считая собаки", 348, "Вышайшая школа", 1993);
        System.out.println(book5);
        System.out.println("" +
                "");
        System.out.println("Сравнение авторов: " + author4.equals(author1));

        System.out.println("" +
                "");
        System.out.println(book1 + " и " + book2 + " " +  book1.equals((book2))+ " - "); // проверка работы toString  и equals
        System.out.println("" +
                "");
        System.out.println(book2 + " и " + book4 + book2.equals((book4))+ " - ");
        System.out.println("" +
                "");
        System.out.println(book3 + " и " + book5 + " " +  book3.equals((book5)) + " - ");
        System.out.println("" +
                "");

        book2.setPageAmount(452); // изменение полей
        System.out.println(book2);
        System.out.println("" +
                "");

        book1.setPublishName("Юго-Восток");
        System.out.println(book1);
        System.out.println("" +
                "");

        book4.setPublishYear(2023);
        System.out.println(book4);
        book1.setPublishYear(1999);
        System.out.println(book1);
        System.out.println("" +
                "");
        System.out.println("hashCodes:"); // проверка хэшей
        System.out.println(book1 + " hashCode: " + book1.hashCode());
        System.out.println(book2 + " hashCode: " + book2.hashCode());
        System.out.println(book3 + " hashCode: " + book3.hashCode());
        System.out.println(book4 + " hashCode: " + book4.hashCode());
        System.out.println(book5 + " hashCode: " + book5.hashCode());
        System.out.println("" +
                "");
        System.out.println(book3 + " и " + book5 + ", сравнить хэш: " + (book3.hashCode()==(book5.hashCode()))); // ну и просто так, сравнить
        System.out.println("" +
                "");
        System.out.println(book4 + " и " + book1 + ", сравнить хэш: " + (book4.hashCode()==(book1.hashCode())));
    }

}
