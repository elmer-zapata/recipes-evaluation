package com.example.recipesevaluation.service;

import com.example.recipesevaluation.model.User;
import com.example.recipesevaluation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Elmer on 07/01/2019.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).get();
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public void eliminar(User user){
        userRepository.delete(user);
    }
}
