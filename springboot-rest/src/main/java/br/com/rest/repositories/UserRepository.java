package br.com.rest.repositories;

import br.com.rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u Where u.userName =:userName")
    User findByUsername(@Param("userName") String userName);
}