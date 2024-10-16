package net.lightamethyst.invisiblearmor;

import net.fabricmc.api.ModInitializer;

import net.lightamethyst.invisiblearmor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvisibleArmor implements ModInitializer {
	public static final String MOD_ID = "invisiblearmor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}