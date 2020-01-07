package com.merel.strengthexercisecrudservice.dao;

import com.merel.strengthexercisecrudservice.dto.StrengthExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StrengthExerciseDao extends JpaRepository<StrengthExercise, Integer> {
    List<StrengthExercise> findStrengthExerciseByExerciseDescription(String exerciseDescription);
}