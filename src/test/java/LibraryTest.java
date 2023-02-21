import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library=new Library(100);
        book= new Book("Harry Potter", "J. K. Rowling", "Fantasy");
    }

    @Test
    public void canReturnBooksCount(){
        assertEquals(0, library.getBooksCount());
    }

    @Test
    public void canAddBooks(){
        library.addBooks(book);
        assertEquals(1, library.getBooksCount());
    }

}
