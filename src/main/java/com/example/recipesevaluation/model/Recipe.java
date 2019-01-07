package com.example.recipesevaluation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Elmer on 07/01/2019.
 */

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title; // exp : Chorizo Stuffed Bell Peppers
    private String description; // exp : optional exp : an amazing recipe ...
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private User author; // exp : Chef Yanki naki
    private String photo; // exp : https://www.allrecipe.com/recipe/img/1x.png
    private String tag; // exp : main dishes
    private String nutrition; // exp : 150 cals
    private String preparationTime; // exp : 40 m
    private String cookTime; // exp : 1 h
    private String readyInTime; // exp :1h 40 m
    private String ingredients; // exp : water, salt, carrot ...
    private String instructions; // exp : step 1, step 2 ..end
    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getReadyInTime() {
        return readyInTime;
    }

    public void setReadyInTime(String readyInTime) {
        this.readyInTime = readyInTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
