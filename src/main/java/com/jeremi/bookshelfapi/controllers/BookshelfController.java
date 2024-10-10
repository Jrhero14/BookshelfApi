package com.jeremi.bookshelfapi.controllers;

import com.jeremi.bookshelfapi.helpers.ResponseHelper;
import com.jeremi.bookshelfapi.models.entity.Book;
import com.jeremi.bookshelfapi.services.book.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookshelfController {

    private BookService bookService;
    public BookshelfController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public ResponseEntity<?> index(){
        var booksData = this.bookService.getBooks();
        return ResponseHelper.toJson("Okey","Berhasil Mendapatkan Buku", booksData, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createBook(@Valid @RequestBody Book book){
        var createdBook = this.bookService.createNewBook(book);
        return ResponseHelper.toJson("Okey","Berhasil Membuat Buku", createdBook, HttpStatus.OK);
    }

}
