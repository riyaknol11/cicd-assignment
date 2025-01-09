package repository;

import model.TaskPriority;
import model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByPriority(TaskPriority priority);
    List<Task> findByAssignedTo(String assignedTo);
}