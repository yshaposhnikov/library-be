package sk.umb.example.library.borrowing.controller;
import sk.umb.example.library.book.Book;
import sk.umb.example.library.customer.User;

public class BorrowedBook {
    public long id;
    public User borrower;
    public Book book;
}
