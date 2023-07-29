package org.example.excercise.restrepo;

import org.example.excercise.Excercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcerciseRestRepo extends JpaRepository<Excercise,Long> {

}
