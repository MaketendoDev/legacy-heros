
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.legacyheroes.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.legacyheroes.client.model.Modeldekus_mk1_suit;
import net.maketendo.legacyheroes.client.model.Modeldekus_mk1_mask;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LegacyHeroesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldekus_mk1_suit.LAYER_LOCATION, Modeldekus_mk1_suit::createBodyLayer);
		event.registerLayerDefinition(Modeldekus_mk1_mask.LAYER_LOCATION, Modeldekus_mk1_mask::createBodyLayer);
	}
}
