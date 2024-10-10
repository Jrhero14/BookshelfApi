package com.jeremi.bookshelfapi.services.book;

import com.jeremi.bookshelfapi.exceptions.servicesException.BookNotFoundException;
import com.jeremi.bookshelfapi.models.entity.Book;
import com.jeremi.bookshelfapi.models.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookServiceImplementation implements BookService {

    private final BookRepository bookRepository;
    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getBook(UUID id) throws RuntimeException {
        var book = this.bookRepository.findById(id);
        if (book.isEmpty()){
            throw new BookNotFoundException("Book by id = "+ id +" not found");
        }
        return book.get();
    }

    @Override
    public Book createNewBook(Book book) {
        return this.bookRepository.save(book);
    }
}
