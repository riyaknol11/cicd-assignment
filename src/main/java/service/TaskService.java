package service;

import model.TaskPriority;
import model.TaskStatus;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    void deleteTask(Long id);
    List<Task> getTasksByStatus(TaskStatus status);
    List<Task> getTasksByPriority(TaskPriority priority);
    List<Task> getTasksByAssignee(String assignedTo);
}