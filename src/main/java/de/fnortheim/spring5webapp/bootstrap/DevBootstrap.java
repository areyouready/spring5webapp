package de.fnortheim.spring5webapp.bootstrap;

import de.fnortheim.spring5webapp.model.Author;
import de.fnortheim.spring5webapp.model.Book;
import de.fnortheim.spring5webapp.model.Publisher;
import de.fnortheim.spring5webapp.model.repositories.AuthorRepository;
import de.fnortheim.spring5webapp.model.repositories.BookRepository;
import de.fnortheim.spring5webapp.model.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * created by sebastianbasner on Mar, 2019
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher techPress = new Publisher("Tech Press", "Tech Boulevard");
        publisherRepository.save(techPress);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "0815", techPress);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Publisher javaBooks = new Publisher("Java Books", "Oracle Loop");
        publisherRepository.save(javaBooks);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB", "4711", javaBooks);
        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEjb);
    }

}
