package de.fnortheim.spring5webapp.model.repositories;

import de.fnortheim.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastianbasner on Mar, 2019
 */
public interface AuthorRepository extends CrudRepository<Author, Long> { //Long because the ID of Author is of type Long
}
