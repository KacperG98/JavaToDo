package pl.todolist.tdapi.endpoints;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.todolist.tdapi.entity.Task;
import pl.todolist.tdapi.managers.TaskManager;

@RestController
@RequestMapping("/task")
public class TicketAPI {
    private TaskManager tasks;

    @Autowired
    public TicketAPI(TaskManager tasks) {
        this.tasks = tasks;
    }

    @GetMapping("/all")
    public Iterable<Task> findAll() {
        return tasks.findAll();
    }

    @GetMapping
    public Optional<Task> findOne(@RequestParam Long index) {
        return tasks.findOne(index);
    }

    @PostMapping
    public Task add(@RequestBody Task task) {
        return tasks.save(task);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        tasks.delete(id);
    }
}