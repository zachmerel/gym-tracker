package com.merel.exercisecrudservice.dao;

import com.merel.exercisecrudservice.dto.StrengthExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrengthExerciseDao extends JpaRepository<StrengthExercise, Integer> {
}
