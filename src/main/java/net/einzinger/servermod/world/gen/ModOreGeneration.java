package net.einzinger.servermod.world.gen;

import net.einzinger.servermod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static  void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.ZINC_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_ZINC_ORE_PLACED);
        base.add(ModPlacedFeatures.END_ORE_PLACED);
    }
}
