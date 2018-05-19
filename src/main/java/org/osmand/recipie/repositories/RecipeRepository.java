package org.osmand.recipie.repositories;

import org.osmand.recipie.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
