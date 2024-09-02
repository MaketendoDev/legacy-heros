
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.legacyheroes.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.legacyheroes.client.model.Modeltest;
import net.maketendo.legacyheroes.client.model.Modeldekus_first_mask_java;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LegacyHeroesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldekus_first_mask_java.LAYER_LOCATION, Modeldekus_first_mask_java::createBodyLayer);
		event.registerLayerDefinition(Modeltest.LAYER_LOCATION, Modeltest::createBodyLayer);
	}
}
