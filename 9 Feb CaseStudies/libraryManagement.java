class Book {
    String title;
    String author;
    String isbn;
    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }
}
class Library {
    Book books[] = new Book[10];
    int count = 0;
    void addBook(Book b) {
        books[count] = b;
        count++;
    }
    Book searchByTitle(String t) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(t)) return books[i];
        }
        return null;
    }
    void displayAllBooks() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}
public class libraryManagement {
    public static void main(String[] args) {
        Library l = new Library();

        l.addBook(new Book("Java", "Manan", "102"));
        l.addBook(new Book("DSA", "Mohuul", "122"));

        Book b = l.searchByTitle("Java");
        if (b != null) b.display();

        l.displayAllBooks();
    }
}
