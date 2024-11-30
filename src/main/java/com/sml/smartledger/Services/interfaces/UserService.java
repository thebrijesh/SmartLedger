package com.sml.smartledger.Services.interfaces;



import com.sml.smartledger.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(Long id);

    Optional<User> updateUser(User user);

    void deleteUser(Long id);

    boolean isUserExist(Long userId);

    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    User getUserByEmail(String email);
}
