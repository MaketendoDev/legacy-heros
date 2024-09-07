package net.maketendo.legacyheroes.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QuirkTickingProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("invisibility")) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 250, false, false));
			}
		} else if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("zero gravity")) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
				if (entity.isShiftKeyDown()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 250, false, false));
				}
			}
		} else if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("amphibian")) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 250, false, false));
			}
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 7) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 5, false, false));
				}
			}
		}
	}
}
