
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.legacyheroes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.maketendo.legacyheroes.procedures.HerocostumesuitcasePropertyValueProviderProcedure;
import net.maketendo.legacyheroes.item.HerocostumesuitcaseItem;
import net.maketendo.legacyheroes.item.DekusMk1HeroCostumeItem;
import net.maketendo.legacyheroes.LegacyHeroesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LegacyHeroesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LegacyHeroesMod.MODID);
	public static final RegistryObject<Item> HEROCOSTUMESUITCASE = REGISTRY.register("herocostumesuitcase", () -> new HerocostumesuitcaseItem());
	public static final RegistryObject<Item> DEKUS_MK_1_HERO_COSTUME_HELMET = REGISTRY.register("dekus_mk_1_hero_costume_helmet", () -> new DekusMk1HeroCostumeItem.Helmet());
	public static final RegistryObject<Item> DEKUS_MK_1_HERO_COSTUME_CHESTPLATE = REGISTRY.register("dekus_mk_1_hero_costume_chestplate", () -> new DekusMk1HeroCostumeItem.Chestplate());
	public static final RegistryObject<Item> DEKUS_MK_1_HERO_COSTUME_LEGGINGS = REGISTRY.register("dekus_mk_1_hero_costume_leggings", () -> new DekusMk1HeroCostumeItem.Leggings());
	public static final RegistryObject<Item> DEKUS_MK_1_HERO_COSTUME_BOOTS = REGISTRY.register("dekus_mk_1_hero_costume_boots", () -> new DekusMk1HeroCostumeItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(HEROCOSTUMESUITCASE.get(), new ResourceLocation("legacy_heroes:herocostumesuitcase_rendersuitcasenumber"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) HerocostumesuitcasePropertyValueProviderProcedure.execute(entity));
		});
	}
}
