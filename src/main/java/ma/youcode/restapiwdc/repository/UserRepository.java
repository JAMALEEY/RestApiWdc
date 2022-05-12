package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA repositories are interfaces with methods supporting :
// creating, reading, updating, and deleting records against a back end data store
public interface UserRepository extends JpaRepository<User, Long> {
        // Spring makes accessing data easy. By simply extending JpaRepository
    // specifying the domain type as User and the id type as Long.
        }
