package com.example.recipesevaluation.controller;

import com.example.recipesevaluation.model.User;
import com.example.recipesevaluation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Elmer on 07/01/2019.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> consulta(){
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public ResponseEntity<User> getIdUser(@PathVariable("id") int id){
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.registerUser(user), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.registerUser(user), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
        User user = userService.getUserById(id);
        userService.eliminar(user);
        return new ResponseEntity<String>("User deleted", HttpStatus.OK);
    }
}
