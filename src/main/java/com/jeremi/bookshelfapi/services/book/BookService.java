package com.jeremi.bookshelfapi.services.book;

import com.jeremi.bookshelfapi.exceptions.servicesException.BookNotFoundException;
import com.jeremi.bookshelfapi.models.entity.Book;

import java.util.UUID;

public interface BookService {

    public Iterable<Book> getBooks();

    public Book getBook(UUID id) throws BookNotFoundException;

    public Book createNewBook(Book book);
}
