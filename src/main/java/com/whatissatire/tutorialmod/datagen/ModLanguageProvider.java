package com.whatissatire.tutorialmod.datagen;

import com.whatissatire.tutorialmod.TutorialMod;
import com.whatissatire.tutorialmod.block.ModBlocks;
import com.whatissatire.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.text.MessageFormat;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, TutorialMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(ModItems.BISMUTH, "Bismuth");
        addItem(ModItems.RAW_BISMUTH, "Raw Bismuth");
        addItem(ModItems.CHISEL, "Chisel");
        addItem(ModItems.RADISH, "Radish");
        addItem(ModItems.FROSTFIRE_ICE, "Frostfire Ice");
        addItem(ModItems.STARLIGHT_ASHES, "Starlight Ashes");

        // Blocks
        addBlock(ModBlocks.BISMUTH_BLOCK, "Bismuth Block");
        addBlock(ModBlocks.BISMUTH_ORE, "Bismuth Ore");
        addBlock(ModBlocks.BISMUTH_DEEPSLATE_ORE, "Bismuth Deepslate Ore");
        addBlock(ModBlocks.MAGIC_BLOCK, "Magic Block");
        addBlock(ModBlocks.BISMUTH_STAIRS, "Bismuth Stairs");
        addBlock(ModBlocks.BISMUTH_SLAB, "Bismuth Slab");
        addBlock(ModBlocks.BISMUTH_PRESSURE_PLATE, "Bismuth Pressure Plate");
        addBlock(ModBlocks.BISMUTH_BUTTON, "Bismuth Button");
        addBlock(ModBlocks.BISMUTH_FENCE, "Bismuth Fence");
        addBlock(ModBlocks.BISMUTH_FENCE_GATE, "Bismuth Fence Gate");
        addBlock(ModBlocks.BISMUTH_WALL, "Bismuth Wall");
        addBlock(ModBlocks.BISMUTH_DOOR, "Bismuth Door");
        addBlock(ModBlocks.BISMUTH_TRAPDOOR, "Bismuth Trapdoor");

        // Creative Tabs
        add(MessageFormat.format("creativetab.{0}.bismuth_items", TutorialMod.MOD_ID), "Bismuth Items");
        add(MessageFormat.format("creativetab.{0}.bismuth_blocks", TutorialMod.MOD_ID), "Bismuth Blocks");

        // Tooltips
        add(MessageFormat.format("tooltip.{0}.magic_block.tooltip", TutorialMod.MOD_ID), "This Block is very §9MAGICAL§r");
        add(MessageFormat.format("tooltip.{0}.chisel.shift_down", TutorialMod.MOD_ID), "This Item can chisel Blocks into Bricks");
        add(MessageFormat.format("tooltip.{0}.chisel", TutorialMod.MOD_ID), "Press §eShift§r for more Information");
        add(MessageFormat.format("tooltip.{0}.radish.tooltip", TutorialMod.MOD_ID), "Tastes really great!");
    }

}
