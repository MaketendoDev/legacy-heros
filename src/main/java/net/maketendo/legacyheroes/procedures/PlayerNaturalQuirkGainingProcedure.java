package net.maketendo.legacyheroes.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;
import net.maketendo.legacyheroes.init.LegacyHeroesModGameRules;
import net.maketendo.legacyheroes.LegacyHeroesMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerNaturalQuirkGainingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double RandomGainQuirk = 0;
		double quirk = 0;
		if (world.getLevelData().getGameRules().getBoolean(LegacyHeroesModGameRules.ALLOW_PLAYERS_MANIFESTING_QUIRKS) == true) {
			if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("none")) {
				if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown_timer == 0) {
					RandomGainQuirk = Mth.nextInt(RandomSource.create(), 0, 3);
					if (RandomGainQuirk == 0) {
						quirk = Mth.nextInt(RandomSource.create(), 0, 5);
						if (quirk == 0) {
							entity.getPersistentData().putString("quirk", "invisibility");
							{
								String _setval = "invisibility";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if (quirk == 1) {
							entity.getPersistentData().putString("quirk", "hardening");
							{
								String _setval = "hardening";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if (quirk == 2) {
							entity.getPersistentData().putString("quirk", "zerogravity");
							{
								String _setval = "zerogravity";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if (quirk == 3) {
							entity.getPersistentData().putString("quirk", "healing");
							{
								String _setval = "healing";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if (quirk == 4) {
							entity.getPersistentData().putString("quirk", "quirkless");
							{
								String _setval = "quirkless";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							entity.getPersistentData().putString("quirk", "invisibility");
							{
								String _setval = "invisibility";
								entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.quirk = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						LegacyHeroesMod.LOGGER.info((entity + " gained the quirk: " + (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk));
					}
				}
			}
		}
	}
}
