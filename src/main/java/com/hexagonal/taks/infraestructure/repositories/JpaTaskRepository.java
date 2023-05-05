package com.hexagonal.taks.infraestructure.repositories;

import com.hexagonal.taks.infraestructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity,Long> {
}
