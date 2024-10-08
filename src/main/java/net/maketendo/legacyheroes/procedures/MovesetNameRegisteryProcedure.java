package net.maketendo.legacyheroes.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.maketendo.legacyheroes.network.LegacyHeroesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MovesetNameRegisteryProcedure {
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
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("invisibility")) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
				{
					String _setval = "Warp Refraction";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
				{
					String _setval = "Phantom Touch";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("zero gravity")) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
				{
					String _setval = "Float Field";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
				{
					String _setval = "Skill Release";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
				{
					String _setval = "Levitation";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("hardening")) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
				{
					String _setval = "Harden Body";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
				{
					String _setval = "Red Riot Unbreakable";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("healing")) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
				{
					String _setval = "Kiss";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
				{
					String _setval = "Self Healing";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk).equals("amphibian")) {
			if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 1) {
				{
					String _setval = "Frog Jump";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 2) {
				{
					String _setval = "Tongue Grapple";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LegacyHeroesModVariables.PlayerVariables())).quirk_attack_selection_rotor == 3) {
				{
					String _setval = "Sunlight Strength";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "None";
					entity.getCapability(LegacyHeroesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.quirk_attack_selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
