package org.example.user;



import org.example.workout.Workout;

import javax.persistence.*;
import java.util.List;



@Entity
public class User {


    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "user_sequence")
    private Long Id;

    @Column(unique = true)
    private String Username;
    private String Password;

    @OneToMany
    private List<Workout> workouts;

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
