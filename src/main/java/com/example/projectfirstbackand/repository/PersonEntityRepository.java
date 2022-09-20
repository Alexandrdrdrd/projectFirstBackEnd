package com.example.projectfirstbackand.repository;

import com.example.projectfirstbackand.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonEntityRepository extends JpaRepository<PersonEntity, Integer> {
}
