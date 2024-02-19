package Innerclass;
import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String authorName) {
        Book book = new Book(title);
        book.addAuthor(authorName);
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private class Book {
        private String title;
        private ArrayList<Author> authors;

        public Book(String title) {
            this.title = title;
            authors = new ArrayList<>();
        }

        public void addAuthor(String name) {
            Author author = new Author(name);
            authors.add(author);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Title: ").append(title).append("\n");
            sb.append("Authors:\n");
            for (Author author : authors) {
                sb.append(author).append("\n");
            }
            return sb.toString();
        }

        private class Author {
            private String name;

            public Author(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java Programming", "John Doe");
        library.addBook("Introduction to Algorithms", "Alice Smith");
        library.displayBooks();
    }
}
