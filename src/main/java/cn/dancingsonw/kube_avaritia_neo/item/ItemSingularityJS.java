package cn.dancingsonw.kube_avaritia_neo.item;

import com.google.gson.JsonObject;
import dev.latvian.mods.kubejs.item.ItemBuilder;
import net.byAqua3.avaritia.item.ItemSingularity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ItemSingularityJS extends ItemSingularity {
    public ItemSingularityJS(Builder builder, Properties properties) {
        super(properties, builder.color, builder.layerColor);
    }

    public static class Builder extends ItemBuilder {

        private transient int color;
        private transient int layerColor;

        public Builder(ResourceLocation name) {
            super(name);
            color = 0xFFFFFF;
            layerColor = 0xFFFFFF;

            modelJson = new JsonObject();
            modelJson.addProperty("parent", "minecraft:item/generated");

            JsonObject textures = new JsonObject();
            textures.addProperty("layer0", "avaritia:item/singularity/singularity_layer_0");
            textures.addProperty("layer1", "avaritia:item/singularity/singularity_layer_1");
            modelJson.add("textures", textures);

            modelJson.addProperty("loader", "avaritia:halo");

            JsonObject halo = new JsonObject();
            halo.addProperty("type", 2);
            modelJson.add("halo", halo);
        }

        public Builder singularityColor(int color) {
            this.color = color;
            return this;
        }

        public Builder singularityLayerColor(int color) {
            this.layerColor = color;
            return this;
        }

        @Override
        public Item createObject() {
            return new ItemSingularityJS(this, createItemProperties());
        }
    }
}
