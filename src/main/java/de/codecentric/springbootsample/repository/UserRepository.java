package de.codecentric.springbootsample.repository;

import de.codecentric.springbootsample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Patrick-PC on 19.06.2018.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
