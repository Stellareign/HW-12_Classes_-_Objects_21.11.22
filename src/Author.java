import java.util.Objects;

public class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;

    }

    public final String toString() {
        return authorName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName);
    }
}

