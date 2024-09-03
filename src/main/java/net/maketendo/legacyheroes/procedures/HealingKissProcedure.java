package net.maketendo.legacyheroes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

import java.util.List;
import java.util.Comparator;

public class HealingKissProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 10) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 15) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon area_effect_cloud ^ ^1 ^3 {Particle:mobSpell,Radius:4f,Duration:10,Color:65450}");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 15 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 25) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon area_effect_cloud ^ ^1 ^3 {Particle:mobSpell,Radius:5f,Duration:10,Color:65450}");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 25 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 35) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon area_effect_cloud ^ ^1 ^3 {Particle:mobSpell,Radius:6f,Duration:10,Color:65450}");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon area_effect_cloud ^ ^1 ^3 {Particle:mobSpell,Radius:7f,Duration:10,Color:65450}");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 200, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
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
	}
}
