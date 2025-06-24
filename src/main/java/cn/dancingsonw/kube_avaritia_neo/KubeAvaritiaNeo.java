package cn.dancingsonw.kube_avaritia_neo;

import com.mojang.logging.LogUtils;
import net.byAqua3.avaritia.Avaritia;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KubeAvaritiaNeo.MODID)
public class KubeAvaritiaNeo {
    public static final String MODID = "kube_avaritia_neo";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KubeAvaritiaNeo() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }

    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }
    public static ResourceLocation avaritiaId(String id) {
        return new ResourceLocation(Avaritia.MODID, id);
    }
}
