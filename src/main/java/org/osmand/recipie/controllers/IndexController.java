package org.osmand.recipie.controllers;

import org.osmand.recipie.services.RecipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
       this.recipeService = recipeService;
    }


    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        logger.info(":::::::: In Index Controller :::::::::");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
