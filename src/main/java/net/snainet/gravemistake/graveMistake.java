package net.snainet.gravemistake;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snainet.gravemistake.blocks.Gravestone;

public class graveMistake implements ModInitializer {

    public static final String MOD_ID = "gravemistake";

    public static final Block GRAVESTONE = new Gravestone(FabricBlockSettings.of(Material.BARRIER).strength(100f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gravestone"), GRAVESTONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gravestone"), new BlockItem(GRAVESTONE, new Item.Settings().group(ItemGroup.MISC)));
    }
}
