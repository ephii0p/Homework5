package AddTask;

public class Book {
    public int id;
    public String bookName;
    public String genre;
    public String authorName;
    public int year;
    public String description;

    public Book(int id, String bookName, String genre, String authorName, int year, String description) {
        this.id = id;
        this.bookName = bookName;
        this.genre = genre;
        this.authorName = authorName;
        this.year = year;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
