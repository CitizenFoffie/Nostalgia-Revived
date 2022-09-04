package net.CitizenFoffie.Nostalgia.block;

import net.CitizenFoffie.Nostalgia.NostalgiaRevived;
import net.CitizenFoffie.Nostalgia.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
        public static final Block EMERALD_ORE = registerBlock("ruby_ore",
                        new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool(),
                                        UniformIntProvider.create(3, 7)),
                        ModItemGroup.NOSTALGIAREVIVED);

        public static final Block EMERALD_BLOCK = registerBlock("ruby_block",
                        new Block(FabricBlockSettings.of(Material.METAL).strength(2f)),
                        ModItemGroup.NOSTALGIAREVIVED);

        public static final Block BLACK_PLANK = registerBlock("black_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);

        public static final Block BLUE_PLANK = registerBlock("blue_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block WHITE_PLANK = registerBlock("white_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block RED_PLANK = registerBlock("red_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block GREEN_PLANK = registerBlock("green_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block BROWN_PLANK = registerBlock("brown_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block PURPLE_PLANK = registerBlock("purple_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block CYAN_PLANK = registerBlock("cyan_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block LIGHT_GRAY_PLANK = registerBlock("light_gray_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block ORANGE_PLANK = registerBlock("orange_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block MAGENTA_PLANK = registerBlock("magenta_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block LIGHT_BLUE_PLANK = registerBlock("light_blue_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block LIME_PLANK = registerBlock("lime_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block PINK_PLANK = registerBlock("pink_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block YELLOW_PLANK = registerBlock("yellow_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);
        public static final Block GRAY_PLANK = registerBlock("gray_plank",
                        new Block(FabricBlockSettings.of(Material.WOOD).strength(2f, 3f)),
                        ModItemGroup.NOSTALGIAREVIVED);

        private static Block registerBlock(String name, Block block, ItemGroup tab) {
                registerBlockItem(name, block, tab);
                return Registry.register(Registry.BLOCK, new Identifier(NostalgiaRevived.MODID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
                return Registry.register(Registry.ITEM, new Identifier(NostalgiaRevived.MODID, name),
                                new BlockItem(block, new FabricItemSettings().group(tab)));
        }

        public static void registerModBlocks() {
                NostalgiaRevived.LOGGER.debug("Registering Mod Blocks for" + NostalgiaRevived.MODID);
        }
}
