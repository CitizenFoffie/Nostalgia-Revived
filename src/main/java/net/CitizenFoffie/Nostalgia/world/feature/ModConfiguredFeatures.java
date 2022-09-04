package net.CitizenFoffie.Nostalgia.world.feature;

import net.CitizenFoffie.Nostalgia.NostalgiaRevived;
import net.CitizenFoffie.Nostalgia.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EMERALD_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> EMERALD_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RUBY_ORES, 4));

    public static void registerConfiguredFeatures() {
        NostalgiaRevived.LOGGER.debug("Registering the ModConfiguredFeatures for " + NostalgiaRevived.MODID);
    }
}
