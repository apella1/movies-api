package me.apella.movies.repository;

import me.apella.movies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>, ListPagingAndSortingRepository<User, Long> {
    Long countByLastName(String lastName);
    Long deleteByFirstName(String firstName);
    List<User> removeByLastName(String lastName);
}