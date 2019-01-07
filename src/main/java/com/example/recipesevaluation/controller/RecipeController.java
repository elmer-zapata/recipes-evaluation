package com.example.recipesevaluation.controller;

import com.example.recipesevaluation.model.Recipe;
import com.example.recipesevaluation.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Elmer on 07/01/2019.
 */
@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value="/recipe", method = RequestMethod.GET)
    public ResponseEntity<List<Recipe>> consulta(){
        return new ResponseEntity<List<Recipe>>(recipeService.getRecipes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe/{id}",method = RequestMethod.GET)
    public ResponseEntity<Recipe> getIdRecipe(@PathVariable("id") int id){
        return new ResponseEntity<Recipe>(recipeService.getRecipeById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe/{id_user}",method = RequestMethod.GET)
    public ResponseEntity<Recipe> getIdRecipeByUser(@PathVariable("id_user") int id_user){
        return new ResponseEntity<Recipe>((Recipe) recipeService.getRecipeByIdUser(id_user), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe){
        return new ResponseEntity<Recipe>(recipeService.registerRecipe(recipe), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe recipe){
        return new ResponseEntity<Recipe>(recipeService.registerRecipe(recipe), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteRecipe(@PathVariable("id") int id){
        Recipe recipe = recipeService.getRecipeById(id);
        recipeService.eliminar(recipe);
        return new ResponseEntity<String>("Recipe deleted", HttpStatus.OK);
    }
}
