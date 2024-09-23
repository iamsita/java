import java.util.Scanner;

class BookData {
    String book_name;
    String isbn;
    String author;
    int price;

    void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name:");
        book_name = scanner.nextLine();
        System.out.println("Enter ISBN:");
        isbn = scanner.nextLine();
        System.out.println("Enter author:");
        author = scanner.nextLine();
        System.out.println("Enter price:");
        price = scanner.nextInt();
        scanner.close();
    }

    void displayData() {
        System.out.println("Book Name: " + book_name);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Book {
    public static void main(String[] args) {
        BookData bookData = new BookData();
        bookData.readData();
        bookData.displayData();
    }
}