import model.Book;
import model.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("qweqw","qwe");
        library.addBook(book);
        library.addBook(null);
        System.out.println();

        Book book1 = library.getBook("qweqw","qwe");
        if(book1 != null){
            System.out.println(book1);
        }else{
            System.out.println("книжки кончились");
        }
    }
}
