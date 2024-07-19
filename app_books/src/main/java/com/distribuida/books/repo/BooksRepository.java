package com.distribuida.books.repo;

import com.distribuida.books.db.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class BooksRepository  implements PanacheRepositoryBase<Book, Integer> {
}
