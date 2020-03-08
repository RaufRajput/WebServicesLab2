package se.lab2webservices.todoms.repo;

import se.lab2webservices.todoms.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long>
{

}