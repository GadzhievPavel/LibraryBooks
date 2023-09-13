package model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        if(book != null){
            books.add(book);
        }
    }

    public Book getBook(String name, String author){
        for (int i =0; i<books.size();i++){
            Book book = books.get(i);
            if(book.getName().equals(name) && book.getAuthor().equals(author)){
                books.remove(i);
                return book;
            }
        }
        return null;
    }
}
