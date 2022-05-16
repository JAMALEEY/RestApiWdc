package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.user.UserDto;
import ma.youcode.restapiwdc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Spring Data JPA repositories are interfaces with methods supporting :
// creating, reading, updating, and deleting records against a back end data store
@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {
        // Spring makes accessing data easy. By simply extending JpaRepository
    // specifying the domain type as User and the id type as Long.
//        UserDto findByEmail(String email);
        public UserDto findByEmail(String email);
        Optional<UserDto> findByLogin(String login);
        }
