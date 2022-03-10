package lesson_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        System.out.println("1. Input book");
        System.out.println("2. Find book by ISBN");
        System.out.println("0. Exit!");

        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.println("Please select any option above!");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    System.out.println("Please input ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.println("Please input title: ");
                    String title = scanner.nextLine();
                    System.out.println("Please input author name: ");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input year: ");
                    int year = scanner.nextInt();
                    Book book = new Book(ISBN, title, authorName, year);
                    books.add(book);
                    break;
                case 2:
                    System.out.println("Please input ISBN to find a book: ");
                    String myISBN = scanner.nextLine();
                    List<Book> findBooks = findBookByISBN(myISBN, books);
                    if(findBooks.size()==0) {
                        System.out.println("Book not found!");
                        break;
                    }
                    for(Book book1 : findBooks) {
                        System.out.println(book1);
                    }
                    break;
            }
        }
        }
    private static List<Book> findBookByISBN(String ISBN, List<Book> books) {
        List<Book> findBooks = new ArrayList<>();
        for(Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }
}
