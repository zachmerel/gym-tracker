package com.merel.exercisecrudservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "gym")
public class Exercise {


    private Integer exerciseId;
    private String exerciseDescription;
    private int frequency;
    private String type;
    private int numberOfSets;
    private int numberOfReps;
    private double weight;
    private String notes;
    private int caloriesBurned;
    private double duration;
    private boolean toFailure;

    public Exercise() {
    }

    public Exercise(Integer exerciseId, String exerciseDescription, int frequency,
                    String type, int numberOfSets, int numberOfReps, double weight,
                    String notes, int caloriesBurned, double duration, boolean toFailure) {
        this.exerciseId = exerciseId;
        this.exerciseDescription = exerciseDescription;
        this.frequency = frequency;
        this.type = type;
        this.numberOfSets = numberOfSets;
        this.numberOfReps = numberOfReps;
        this.weight = weight;
        this.notes = notes;
        this.caloriesBurned = caloriesBurned;
        this.duration = duration;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
        Exercise exercise = (Exercise) o;
        return frequency == exercise.frequency &&
                numberOfSets == exercise.numberOfSets &&
                numberOfReps == exercise.numberOfReps &&
                Double.compare(exercise.weight, weight) == 0 &&
                caloriesBurned == exercise.caloriesBurned &&
                Double.compare(exercise.duration, duration) == 0 &&
                toFailure == exercise.toFailure &&
                Objects.equals(exerciseId, exercise.exerciseId) &&
                Objects.equals(exerciseDescription, exercise.exerciseDescription) &&
                Objects.equals(type, exercise.type) &&
                Objects.equals(notes, exercise.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseId, exerciseDescription, frequency, type, numberOfSets, numberOfReps, weight, notes, caloriesBurned, duration, toFailure);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseId=" + exerciseId +
                ", exerciseDescription='" + exerciseDescription + '\'' +
                ", frequency=" + frequency +
                ", type='" + type + '\'' +
                ", numberOfSets=" + numberOfSets +
                ", numberOfReps=" + numberOfReps +
                ", weight=" + weight +
                ", notes='" + notes + '\'' +
                ", caloriesBurned=" + caloriesBurned +
                ", duration=" + duration +
                ", toFailure=" + toFailure +
                '}';
    }
}
