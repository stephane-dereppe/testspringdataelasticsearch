package springdataelastisearch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springdataelastisearch.entity.Book;

public interface BookRepository extends CrudRepository<Book, String> {
	
	List<Book> findByEditorLike(String editor);
	
}
