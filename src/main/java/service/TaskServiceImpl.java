package service;

import model.TaskPriority;
import model.TaskStatus;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import repository.TaskRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskRepository.findByStatus(status);
    }

    @Override
    public List<Task> getTasksByPriority(TaskPriority priority) {
        return taskRepository.findByPriority(priority);
    }

    @Override
    public List<Task> getTasksByAssignee(String assignedTo) {
        return taskRepository.findByAssignedTo(assignedTo);
    }
}