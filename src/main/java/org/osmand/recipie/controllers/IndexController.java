package org.osmand.recipie.controllers;

import lombok.extern.slf4j.Slf4j;
import org.osmand.recipie.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
       this.recipeService = recipeService;
    }


    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        log.info(":::::::: In Index Controller :::::::::");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
