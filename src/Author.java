public class Author {
    static String authorName;
    public Author(String authorName) {
        this.authorName = authorName;
        System.out.println(setAuthorName());
    }

    public String setAuthorName() {
        return this.authorName;

    }

}
