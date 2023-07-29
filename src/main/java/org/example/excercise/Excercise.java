package org.example.excercise;

import org.example.workout.Workout;

import javax.persistence.*;

@Entity
public class Excercise {

    @Id
    @SequenceGenerator(name = "excersise_sequence", sequenceName = "excersise_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "excersise_sequence")
    private Long Id;

    private String name;
    private int reps;
    private int sets;

    @ManyToOne
    private Workout workout;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
