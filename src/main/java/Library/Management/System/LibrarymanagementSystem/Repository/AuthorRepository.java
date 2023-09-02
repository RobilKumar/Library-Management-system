package Library.Management.System.LibrarymanagementSystem.Repository;

import Library.Management.System.LibrarymanagementSystem.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {



   Author findByEmail(String email);
}
