package com.mucahit.recipeapp.service;

import com.mucahit.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
