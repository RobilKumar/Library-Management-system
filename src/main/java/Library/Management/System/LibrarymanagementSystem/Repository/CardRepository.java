package Library.Management.System.LibrarymanagementSystem.Repository;

import Library.Management.System.LibrarymanagementSystem.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {

}
