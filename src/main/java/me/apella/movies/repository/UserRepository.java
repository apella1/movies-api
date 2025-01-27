package me.apella.movies.repository;

import me.apella.movies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    Long countByLastName(String lastName);

    Long deleteByFirstName(String firstName);

    List<User> removeByLastName(String lastName);
}