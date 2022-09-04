package net.CitizenFoffie.Nostalgia.item;

import net.CitizenFoffie.Nostalgia.NostalgiaRevived;
import net.CitizenFoffie.Nostalgia.item.custom.ModAxeItem;
import net.CitizenFoffie.Nostalgia.item.custom.ModHoeItem;
import net.CitizenFoffie.Nostalgia.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item Quiver = registerItem("quiver",
            new Item(new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));

    public static final Item Ruby = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
        new SwordItem(ModToolMaterials.RUBY,2,-2.5F,
                new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterials.RUBY,3.7F,-3F,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY,0,-2.8F,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RUBY,0,-2.5F,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterials.RUBY,-4,-0F,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.NOSTALGIAREVIVED)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NostalgiaRevived.MODID, name), item);
    }

    public static void registerModItems() {
        NostalgiaRevived.LOGGER.debug("Registering Mod Items for" + NostalgiaRevived.MODID);
    }
}
