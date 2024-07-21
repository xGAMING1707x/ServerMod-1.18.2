package net.einzinger.servermod.world.feature;

import net.einzinger.servermod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZINC_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZINC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> NETHER_ZINC_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_ZINC_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> END_ZINC_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_ZINC_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZINC_ORE = FeatureUtils.register("zinc_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_ZINC_ORES, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHERRACK_ZINC_ORE = FeatureUtils.register("netherrack_zinc_ore",
            Feature.ORE, new OreConfiguration(NETHER_ZINC_ORES, 11));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_ZINC_ORE = FeatureUtils.register("end_zinc_ore",
            Feature.ORE, new OreConfiguration(END_ZINC_ORES, 11));
}
