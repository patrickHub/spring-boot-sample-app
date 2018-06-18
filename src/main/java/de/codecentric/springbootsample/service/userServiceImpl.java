package de.codecentric.springbootsample.service;

import de.codecentric.springbootsample.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick-PC on 18.06.2018.
 */

@Service("userService")
public class userServiceImpl implements UserService {
  /*  @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;
    @Qualifier("roleRepository")
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
  */

    private List<User> users = new ArrayList<>();
   /* @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }*/

    @Override
    public void saveUser(User user) {
       /* user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new LinkedList<>(Arrays.asList(userRole)));
        userRepository.save(user);*/
       users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
