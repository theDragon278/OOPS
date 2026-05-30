package CorePrinciplesOfOOPS;

import java.util.*;

class Book {
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName) {
        int indx = title.indexOf(bookName);

        if (indx == -1) {
            System.out.println("Book not found.");
            return;
        }

        if (isAvailable.get(indx)) {
            System.out.println("Book is available. Can be borrowed.");
            isAvailable.set(indx, false);
        } else {
            System.out.println("Book is not available. Cannot be borrowed.");
        }
    }

    public void returnBook(String bookName) {
        int indx = title.indexOf(bookName);

        if (indx == -1) {
            System.out.println("Book not found.");
            return;
        }

        System.out.println(bookName + " is returned. Now it's available.");
        isAvailable.set(indx, true);
    }

    public void getAvailabilityStatus(String bookName) {
        int indx = title.indexOf(bookName);

        if (indx == -1) {
            System.out.println("Book not found.");
            return;
        }

        if (isAvailable.get(indx)) {
            System.out.println(bookName + " is available.");
        } else {
            System.out.println(bookName + " is not available.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        List<String> titles = Arrays.asList(
                "Java Programming",
                "Data Structures",
                "Operating Systems");

        List<String> authors = Arrays.asList(
                "James Gosling",
                "Mark Allen Weiss",
                "Abraham Silberschatz");

        List<Boolean> availability = new ArrayList<>(
                Arrays.asList(true, true, false));

        Book library = new Book(titles, authors, availability);

        library.getAvailabilityStatus("Java Programming");

        library.borrowBook("Java Programming");

        library.getAvailabilityStatus("Java Programming");

        library.returnBook("Java Programming");

        library.getAvailabilityStatus("Java Programming");
    }
}