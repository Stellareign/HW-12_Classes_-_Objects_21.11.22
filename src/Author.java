public class Author {
  private final String authorName; // final был применён по рекомендации Java, пока не могу понять до конца его принцип
    public Author(String authorName) {
        this.authorName = authorName;
        System.out.println(authorName + ":");
           }

    public String getAuthorName() {
        return authorName;

    }

}
