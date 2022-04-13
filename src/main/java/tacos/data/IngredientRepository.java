/*
DEFINING JDBC REPOSITORIES
Your Ingredient repository needs to perform these operations:
* Query for all ingredients into a collection of Ingredient objects
* Query for a single Ingredient by its id
* Save an Ingredient object
 */
package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);


}
