package com.example.recipesevaluation.repository;

import com.example.recipesevaluation.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Elmer on 07/01/2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

}
