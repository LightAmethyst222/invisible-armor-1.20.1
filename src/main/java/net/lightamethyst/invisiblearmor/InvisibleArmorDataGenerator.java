package net.lightamethyst.invisiblearmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.lightamethyst.invisiblearmor.datagen.ModItemTagProvider;
import net.lightamethyst.invisiblearmor.datagen.ModModelProvider;
import net.lightamethyst.invisiblearmor.datagen.ModRecipeProvider;

public class InvisibleArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagProvider::new);

	}
}
