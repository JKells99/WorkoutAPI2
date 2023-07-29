package org.example.workout;

import org.example.user.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Workout {

    @Id
    @SequenceGenerator(name = "workout_sequence", sequenceName = "workout_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "workout_sequence")
    private Long id;

    private String name;

    private LocalDate date;



    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
