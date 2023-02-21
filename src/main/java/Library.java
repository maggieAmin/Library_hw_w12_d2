import java.util.ArrayList;
import java.util.List;

public class Library {
    private Integer capacity;
    private ArrayList<Book> books;

    public Library(Integer capacity){
        this.capacity=capacity;
        this.books= new ArrayList<Book>();
    }

    public int getBooksCount() {
        return  this.books.size();
    }

    public void addBooks(Book book) {
        if(this.books.size() < this.capacity){
            this.books.add(book);
        }
    }

//    public Library() {
//        this.books = new ArrayList<>();
//    }
//
//    public void addBook(Book book) {
//        this.books.add(book);
//    }
}
//
//    public void removeBook(Book book) {
//        this.books.remove(book);
//    }
//
//    public List<Book> getBooks() {
//        return this.books;
//    }
//}
