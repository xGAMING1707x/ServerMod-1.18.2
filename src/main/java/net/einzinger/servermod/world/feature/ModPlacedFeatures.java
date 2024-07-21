package net.einzinger.servermod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> ZINC_ORE_PLACED = PlacementUtils.register("zinc_ore_placed",
            ModConfiguredFeatures.ZINC_ORE, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> NETHER_ZINC_ORE_PLACED = PlacementUtils.register("netherrack_zinc_ore_placed",
            ModConfiguredFeatures.NETHERRACK_ZINC_ORE, ModOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> END_ORE_PLACED = PlacementUtils.register("end_zinc_ore_placed",
            ModConfiguredFeatures.END_ZINC_ORE, ModOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}
