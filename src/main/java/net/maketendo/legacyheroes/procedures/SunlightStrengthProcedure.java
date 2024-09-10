package net.maketendo.legacyheroes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SunlightStrengthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.WARPED_PLANKS.defaultBlockState(), 3);
		}
	}
}
