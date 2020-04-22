package pl.todolist.tdapi.repositories;

import org.springframework.data.repository.CrudRepository;

import pl.todolist.tdapi.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}