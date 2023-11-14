package AddTask;

import java.util.Scanner;

import static AddTask.Book.uniquenessId;

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
                    System.out.println("Введите id:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите название:");
                    String bookName = scanner.nextLine();
                    System.out.println("Введите жанр:");
                    String genre = scanner.nextLine();
                    System.out.println("Введите автора:");
                    String author = scanner.nextLine();
                    System.out.println("Введите год издания:");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите описание книги:");
                    String description = scanner.nextLine();
                    catalog.addBook(new Book(id, bookName, genre, author, year, description));
                    if (uniquenessId.contains(id) == true) {
                        System.out.println("ID " + id + " уже существует");
                    } else {
                        System.out.println("Книга добавлена в картотеку.");}
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
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice < 1 || choice > 6) {
                            System.out.println("Неверная команда. Повторите ввод.");
                        }
                    } else {
                        System.out.println("Ошибка: введите число от 1 до 6");
                        scanner.next();
                    }
            }
        }
    }