package net.CitizenFoffie.Nostalgia.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    // docs suck ass
    //modifiersWithCount count: is the times it tries to generate per chunk, HeightRangePlacement modifier offset values are the range of ores it can spawn
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            ModConfiguredFeatures.EMERALD_ORE, modifiersWithCount(11,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(32))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
