package com.mucahit.recipeapp.controller;


import com.mucahit.recipeapp.domain.Category;
import com.mucahit.recipeapp.domain.UnitOfMeasure;
import com.mucahit.recipeapp.repositories.CategoryRepository;
import com.mucahit.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is : "+category.get().getId());
        System.out.println("UOM id is : "+unitOfMeasure.get().getId());
        return  "index";
    }
}
