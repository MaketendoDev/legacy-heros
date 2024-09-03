package net.maketendo.legacyheroes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

public class SkillReleaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 5) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..10] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 5 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 10) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..15] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 10 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 15) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..17] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 15 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 20) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 15) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..20] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 25 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 30) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 15) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..25] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 30 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 35) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 10) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..30] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 10) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e[distance=..35] minecraft:levitation");
				{
					double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
