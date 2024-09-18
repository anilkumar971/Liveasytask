package com.example.taskLiveasy.repo;


import com.example.taskLiveasy.Entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LoadRepository extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);
}
