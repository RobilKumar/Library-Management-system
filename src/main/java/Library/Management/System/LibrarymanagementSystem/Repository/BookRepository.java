package Library.Management.System.LibrarymanagementSystem.Repository;

import Library.Management.System.LibrarymanagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
