package com.example.demo.dao;

import com.example.demo.entity.TechEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDemoRepository extends JpaRepository<TechEntity, Long> {
}
