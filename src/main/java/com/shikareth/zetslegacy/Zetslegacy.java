package com.shikareth.zetslegacy;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shikareth.zetslegacy.items.ZL_Items;
import com.shikareth.zetslegacy.swords.ZL_Swords;

@Mod("zetslegacy")
public class Zetslegacy
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "zetslegacy";
    
    public static final ItemGroup ZL_ITEM_GROUP = (new ItemGroup("zetslegacy") {
    	@Override
        public ItemStack createIcon() {
           return new ItemStack(ZL_Swords.TEMP_SWORD.get());
        }
     });
    
    public Zetslegacy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ZL_Items.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ZL_Swords.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}
