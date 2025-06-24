package cn.dancingsonw.kube_avaritia_neo.recipe;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.BooleanComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface ExtremeShapelessRecipeSchema {
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result");
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.UNWRAPPED_INPUT_ARRAY.key("ingredients");
    RecipeKey<Boolean> SINGULARITIES = BooleanComponent.BOOLEAN.key("singularities").optional(false);

    RecipeSchema SCHEMA = new RecipeSchema(RESULT, INGREDIENTS, SINGULARITIES)
        .constructor(RESULT, INGREDIENTS, SINGULARITIES)
        .constructor(RESULT, INGREDIENTS);
}
