package AddTask;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        String titleLibrary = "Добро пожаловать в Библиотеку";
        System.out.println("* " + titleLibrary + " *");

            Scanner scanner = new Scanner(System.in);
            BookCatalog catalog = new BookCatalog();

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Добавить книгу");
                System.out.println("2. Удалить книгу");
                System.out.println("3. Поиск по названию");
                System.out.println("4. Поиск по жанру");
                System.out.println("5. Поиск по автору");
                System.out.println("6. Выйти");

                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Введите id, название, жанр, автора, год издания и описание книги:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        String bookName = scanner.nextLine();
                        String genre = scanner.nextLine();
                        String author = scanner.nextLine();
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        String description = scanner.nextLine();
                        catalog.addBook(new Book(id, bookName, genre, author, year, description));
                        System.out.println("Книга добавлена в картотеку.");
                        break;
                    case 2:
                        System.out.println("Введите id книги для удаления:");
                        int idToDelete = scanner.nextInt();
                        catalog.deleteBook(idToDelete);
                        System.out.println("Книга удалена из картотеки.");
                        break;
                    case 3:
                        System.out.println("Введите название для поиска:");
                        String bookNameToSearch = scanner.nextLine();
                        catalog.searchByBookName(bookNameToSearch);
                        break;
                    case 4:
                        System.out.println("Введите жанр для поиска:");
                        String genreToSearch = scanner.nextLine();
                        catalog.searchByGenre(genreToSearch);
                        break;
                    case 5:
                        System.out.println("Введите имя автора для поиска:");
                        String authorToSearch = scanner.nextLine();
                        catalog.searchByAuthor(authorToSearch);
                        break;

                    case 6:
                        System.out.println("Завершение работы программы.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверная команда. Повторите ввод.");
                }
            }
        }
    }
