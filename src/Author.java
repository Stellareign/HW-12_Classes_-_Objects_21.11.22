public class Author {
    static String authorName;
    public Author(String authorName) {
        this.authorName = authorName;
        System.out.println(Author.authorName);
    }

    public String setAuthorName() {
        return authorName;

    }

}
