package org.example.user.service;
import org.example.user.User;
import org.example.user.restrepo.UserRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRestRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRestRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(User user) {

        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        userRepository.save(user);
    }

    public User findUserByEmail(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean checkPassword(String password){

        String hashedpassword = passwordEncoder.encode(password)
        if(password == hashedpassword){
            return true;

        } else{
            return  false;


        }

    }

    // Other methods...
}
