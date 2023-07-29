package org.example.workout.restrepo;

import org.example.workout.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRestRepo extends JpaRepository<Workout,Long> {
}
