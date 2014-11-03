package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.items.ItemLMRB;
import com.pahimar.letsmodreboot.items.ItemMapleLeaf;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    @GameRegistry.ObjectHolder(Reference.MODID)
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init(){

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");


    }
}
