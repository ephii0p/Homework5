package AddTask;

import java.util.HashSet;
import java.util.Set;

class Book {
    protected static Set<Integer> uniquenessId = new HashSet<>();
    protected int id;
    protected String bookName;
    protected String genre;
    protected String authorName;
    protected int year;
    protected String description;

    public Book(int id, String bookName, String genre, String authorName, int year, String description) {
        if (uniquenessId.contains(id)) {
            System.out.println("ID " + id + " уже существует");
            System.out.println("ОШИБКА! ЗАВЕРШЕНИЕ ПРОГРАММЫ! ПОПРОБУЙТЕ СНОВА.");
            System.exit(0);
        } else {
            this.id = id;
            uniquenessId.add(id);
            this.bookName = bookName;
            this.genre = genre;
            this.authorName = authorName;
            this.year = year;
            this.description = description;
        }
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