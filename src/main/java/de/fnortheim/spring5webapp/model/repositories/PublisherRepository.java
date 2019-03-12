package de.fnortheim.spring5webapp.model.repositories;

import de.fnortheim.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastianbasner on Mar, 2019
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
