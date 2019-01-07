package com.example.recipesevaluation.service;

import com.example.recipesevaluation.model.Recipe;
import com.example.recipesevaluation.model.User;
import com.example.recipesevaluation.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by Elmer on 07/01/2019.
 */
@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getRecipes(){
        return (List<Recipe>) recipeRepository.findAll();
    }

    public Recipe getRecipeById(int id){
        return recipeRepository.findById(id).get();
    }

    public List<Recipe> getRecipeByIdUser(int id_user){
        List<Recipe> entities = (List<Recipe>) this.recipeRepository.findAll();
        if (entities.isEmpty()) {
            throw new ResourceNotFoundException(format("No daily electricity report found for the panel '%s'", id_user));
        }
        List<Recipe> result = new ArrayList<>();
        entities.stream()
                .forEach(entity ->{ if(entity.getAuthor().getId()==id_user)result.add(entity);} );

        return entities;

    }

    public Recipe registerRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public void eliminar(Recipe recipe){
        recipeRepository.delete(recipe);
    }
}
