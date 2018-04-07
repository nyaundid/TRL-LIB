package textbookrental;

public class TextBook<Author> {
    private final String title;
    private final Author author;
    private final int ISBN;

    public TextBook(String title, Author author, int id) {
        this.title = title;
        this.author = author;
        this.ISBN = id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getId() {
        return ISBN;
    }
}