package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.blocks.BlockFlag;
import com.pahimar.letsmodreboot.blocks.BlockLMRB;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    @GameRegistry.ObjectHolder(Reference.MODID)

    public static final BlockLMRB flag = new BlockFlag();

    public static void init(){

        GameRegistry.registerBlock(flag,"flag");
    }
}
