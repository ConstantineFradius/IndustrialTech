package mightydanp.industrialtech.common;

import mightydanp.industrialtech.client.ClientProxy;

import mightydanp.industrialtech.common.libs.Ref;
import mightydanp.industrialtech.common.materials.ModMaterials;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by MightyDanp on 9/26/2020.
 */
@Mod(Ref.mod_id)
public class IndustrialTech {
    public static final Logger LOGGER = LogManager.getLogger();

    public IndustrialTech(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::common_proxy);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client_proxy);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void common_proxy(final FMLCommonSetupEvent event) {
        CommonProxy.init(event);
        ModMaterials.commonInit();
    }

    private void client_proxy(final FMLClientSetupEvent event) {
        ClientProxy.init(event);
        ModMaterials.clientInit();
    }
}
