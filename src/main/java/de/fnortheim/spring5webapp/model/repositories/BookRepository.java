package de.fnortheim.spring5webapp.model.repositories;

import de.fnortheim.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastianbasner on Mar, 2019
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
