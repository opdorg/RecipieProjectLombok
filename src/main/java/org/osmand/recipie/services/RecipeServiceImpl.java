package org.osmand.recipie.services;

import lombok.extern.slf4j.Slf4j;
import org.osmand.recipie.domain.Recipe;
import org.osmand.recipie.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        // lombak logger
        log.debug("Size of set: {} ", recipeSet.size());

        return  recipeSet;
    }
}
