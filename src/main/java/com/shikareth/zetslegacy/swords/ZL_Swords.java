package com.shikareth.zetslegacy.swords;

import com.shikareth.zetslegacy.Zetslegacy;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ZL_Swords {

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Zetslegacy.MODID);

	public static final RegistryObject<SwordItem> TEMP_SWORD = REGISTRY.register("temp_sword", 
			() -> new ZL_SwordBase(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties()));
	
}
