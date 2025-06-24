package cn.dancingsonw.kube_avaritia_neo;


import cn.dancingsonw.kube_avaritia_neo.recipe.CompressorRecipeSchema;
import cn.dancingsonw.kube_avaritia_neo.recipe.ExtremeShapedRecipeSchema;
import cn.dancingsonw.kube_avaritia_neo.recipe.ExtremeShapelessRecipeSchema;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;

public class KubeAvaritiaNeoPlugin extends KubeJSPlugin {

    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        event.register(KubeAvaritiaNeo.avaritiaId("extreme_shaped"), ExtremeShapedRecipeSchema.SCHEMA);
        event.register(KubeAvaritiaNeo.avaritiaId("extreme_shapeless"), ExtremeShapelessRecipeSchema.SCHEMA);
        event.register(KubeAvaritiaNeo.avaritiaId("compressor"), CompressorRecipeSchema.SCHEMA);
    }
}
