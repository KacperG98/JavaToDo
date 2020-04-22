package pl.todolist.tdapi.managers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.todolist.tdapi.entity.Task;
import pl.todolist.tdapi.repositories.TaskRepository;

@Service
public class TaskManager {
    private TaskRepository taskRepository;

    @Autowired
    public TaskManager(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Optional<Task> findOne(Long id) {
        return taskRepository.findById(id);
    }

    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}