package com.hexagonal.taks.domain.ports.out;

import com.hexagonal.taks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task saveTask(Task task);

    Optional<Task> findById(Long id);

    List<Task> findAllTasks();

    Optional<Task> update(Task task);

    boolean deleteById(Long id);
}
