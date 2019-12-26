package com.merel.exercisecrudservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "strength_exercise")
public class StrengthExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer exerciseId;
    @NotEmpty
    private String exerciseDescription;
    private int frequency;
    @NotNull
    private int numberOfSets;
    @NotNull
    private int numberOfReps;
    @NotNull
    private double weight;
    private String notes;
    private int restTime;
    private boolean toFailure;

    public StrengthExercise() {
    }

    public StrengthExercise(Integer exerciseId, String exerciseDescription, int frequency, int numberOfSets,
                            int numberOfReps, double weight, String notes, int restTime, boolean toFailure) {
        this.exerciseId = exerciseId;
        this.exerciseDescription = exerciseDescription;
        this.frequency = frequency;
        this.numberOfSets = numberOfSets;
        this.numberOfReps = numberOfReps;
        this.weight = weight;
        this.notes = notes;
        this.restTime = restTime;
        this.toFailure = toFailure;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public int getNumberOfReps() {
        return numberOfReps;
    }

    public void setNumberOfReps(int numberOfReps) {
        this.numberOfReps = numberOfReps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public boolean isToFailure() {
        return toFailure;
    }

    public void setToFailure(boolean toFailure) {
        this.toFailure = toFailure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrengthExercise strengthExercise = (StrengthExercise) o;
        return frequency == strengthExercise.frequency &&
                numberOfSets == strengthExercise.numberOfSets &&
                numberOfReps == strengthExercise.numberOfReps &&
                Double.compare(strengthExercise.weight, weight) == 0 &&
                restTime == strengthExercise.restTime &&
                toFailure == strengthExercise.toFailure &&
                Objects.equals(exerciseId, strengthExercise.exerciseId) &&
                Objects.equals(exerciseDescription, strengthExercise.exerciseDescription) &&
                Objects.equals(notes, strengthExercise.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseId, exerciseDescription, frequency, numberOfSets, numberOfReps, weight, notes, restTime, toFailure);
    }

    @Override
    public String toString() {
        return "StrengthExercise{" +
                "exerciseId=" + exerciseId +
                ", exerciseDescription='" + exerciseDescription + '\'' +
                ", frequency=" + frequency +
                ", numberOfSets=" + numberOfSets +
                ", numberOfReps=" + numberOfReps +
                ", weight=" + weight +
                ", notes='" + notes + '\'' +
                ", restTime=" + restTime +
                ", toFailure=" + toFailure +
                '}';
    }
}
