import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book (String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }

    public Author getAuthor () {
        return this.author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Книга - " + '\'' + title + '\'' +
                " Год издания - " + yearPublication + ' ' +
                author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
