package net.maketendo.legacyheroes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

public class HardeningMoveSetsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
			HardenBodyProcedure.execute(world, entity);
		} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
			RedRiotUnbreakableProcedure.execute(world, entity);
		} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
			BoomBoomProtocalProcedure.execute(world, x, y, z);
		}
	}
}
