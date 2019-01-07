package com.example.recipesevaluation.repository;
import com.example.recipesevaluation.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elmer on 07/01/2019.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
