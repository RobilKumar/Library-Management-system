package Library.Management.System.LibrarymanagementSystem.Repository;

import Library.Management.System.LibrarymanagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
