package net.maketendo.legacyheroes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;
import net.maketendo.legacyheroes.LegacyHeroesMod;

import java.util.List;
import java.util.Comparator;

public class FloatFieldProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 5) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 1, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 20;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(200, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 260, 2, false, false));
						});
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 5 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 10) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 40, 1, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 20;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(200, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 2, false, false));
						});
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 10 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 15) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 20) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 80, 2, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 20;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(200, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 2, false, false));
						});
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 15 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 20) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 15) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 3, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 15;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(300, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 2, false, false));
						});
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 25 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 30) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 15) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 120, 4, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(300, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 80, 1, false, false));
						});
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 30 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) <= 35) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 10) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 140, 5, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(400, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 1, false, false));
						});
					}
				}
			}
		} else {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown >= 5) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 150, 5, false, false));
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.LEVITATION);
						{
							double _setval = (entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_cooldown - 10;
							entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.quirk_cooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						LegacyHeroesMod.queueServerWork(150, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 1, false, false));
						});
					}
				}
			}
		}
	}
}
