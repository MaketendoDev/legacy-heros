package net.maketendo.legacyheroes.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerNaturalQuirkGainingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double RandomGainQuirk = 0;
		double quirk = 0;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("none")) {
				if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown_timer == 0) {
					RandomGainQuirk = Mth.nextInt(RandomSource.create(), 0, 5);
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
					}
				}
			}
		}
	}
}
