public class Author {
    String authorName;
    public Author(String authorName) {
        this.authorName = authorName;
        System.out.println(getAuthorName());
    }

    public String getAuthorName() {
        return this.authorName;

    }

}
