package com.shikareth.zetslegacy.items;

import com.shikareth.zetslegacy.Zetslegacy;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ZL_Items {
	
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Zetslegacy.MODID);

	public static final RegistryObject<Item> TEMP_ITEM = REGISTRY.register("temp_item", 
			() -> new Item(new Properties().group(Zetslegacy.ZL_ITEM_GROUP)));
	
	public static final RegistryObject<Item> ZL_BOOK = REGISTRY.register("arc_wardens_diary", 
			() -> new Item(new Properties().group(Zetslegacy.ZL_ITEM_GROUP)));
}
