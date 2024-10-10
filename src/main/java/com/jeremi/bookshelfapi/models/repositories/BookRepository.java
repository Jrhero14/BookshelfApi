package com.jeremi.bookshelfapi.models.repositories;

import com.jeremi.bookshelfapi.models.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
}
