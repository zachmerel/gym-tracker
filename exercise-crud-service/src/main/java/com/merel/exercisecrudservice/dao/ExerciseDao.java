package com.merel.exercisecrudservice.dao;

import com.merel.exercisecrudservice.dto.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface ExerciseDao extends JpaRepository<Exercise, Integer> {
}
