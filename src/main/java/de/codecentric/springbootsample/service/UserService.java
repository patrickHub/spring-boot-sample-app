package de.codecentric.springbootsample.service;

import de.codecentric.springbootsample.model.User;

import java.util.List;

/**
 * Created by Patrick-PC on 18.06.2018.
 */
public interface UserService {

    public void saveUser(User user);
    public List<User> getUsers();
}
