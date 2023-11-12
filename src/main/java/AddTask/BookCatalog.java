package AddTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalog {
    public List<Book> books;

    public BookCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void searchByBookName(String bookName) {
        List<Book> result = books.stream()
                .filter(book -> book.getBookName().toLowerCase().contains(bookName.toLowerCase()))
                .collect(Collectors.toList());
        printBooks(result);
    }

    public void searchByGenre(String genre) {
        List<Book> result = books.stream()
                .filter(book -> book.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
        printBooks(result);
    }

    public void searchByAuthor(String author) {
        List<Book> result = books.stream()
                .filter(book -> book.getAuthorName().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
        printBooks(result);
    }

    public void searchByYear(int year) {
        List<Book> result = books.stream()
                .filter(book -> book.getYear() == year)
                .collect(Collectors.toList());
        printBooks(result);
    }

    private void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getId() + ": " + book.getBookName() + " - " + book.getAuthorName());
        }
    }
}
