package cn.dancingsonw.kube_avaritia_neo;


import cn.dancingsonw.kube_avaritia_neo.item.ItemSingularityJS;
import cn.dancingsonw.kube_avaritia_neo.recipe.CompressorRecipeSchema;
import cn.dancingsonw.kube_avaritia_neo.recipe.ExtremeShapedRecipeSchema;
import cn.dancingsonw.kube_avaritia_neo.recipe.ExtremeShapelessRecipeSchema;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import dev.latvian.mods.kubejs.registry.RegistryInfo;

public class KubeAvaritiaNeoPlugin extends KubeJSPlugin {

    @Override
    public void init() {
        RegistryInfo.ITEM.addType("singularity", ItemSingularityJS.Builder.class, ItemSingularityJS.Builder::new);
    }

    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        event.register(KubeAvaritiaNeo.avaritiaId("extreme_shaped"), ExtremeShapedRecipeSchema.SCHEMA);
        event.register(KubeAvaritiaNeo.avaritiaId("extreme_shapeless"), ExtremeShapelessRecipeSchema.SCHEMA);
        event.register(KubeAvaritiaNeo.avaritiaId("compressor"), CompressorRecipeSchema.SCHEMA);
    }
}
