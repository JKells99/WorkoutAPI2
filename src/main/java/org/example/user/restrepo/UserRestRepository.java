package org.example.user.restrepo;

import org.example.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRestRepository  extends JpaRepository<User,Long> {

    User findByUsername(String username);





}
