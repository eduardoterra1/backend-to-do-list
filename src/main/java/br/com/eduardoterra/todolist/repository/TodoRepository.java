package br.com.eduardoterra.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardoterra.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
