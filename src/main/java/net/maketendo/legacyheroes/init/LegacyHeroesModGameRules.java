
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.legacyheroes.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LegacyHeroesModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ALLOW_PLAYERS_MANIFESTING_QUIRKS = GameRules.register("allowPlayersManifestingQuirks", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
