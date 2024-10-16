package net.lightamethyst.invisiblearmor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lightamethyst.invisiblearmor.InvisibleArmor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InvisibleArmor.MOD_ID, name), item);
    }

    public static final Item GLASS_HELMET = registerItem("glass_helmet",
            new ArmorItem(ModArmorMaterials.GLASS, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GLASS_CHESTPLATE = registerItem("glass_chestplate",
            new ArmorItem(ModArmorMaterials.GLASS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GLASS_LEGGINGS = registerItem("glass_leggings",
            new ArmorItem(ModArmorMaterials.GLASS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GLASS_BOOTS = registerItem("glass_boots",
            new ArmorItem(ModArmorMaterials.GLASS, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(GLASS_HELMET);
        entries.add(GLASS_CHESTPLATE);
        entries.add(GLASS_LEGGINGS);
        entries.add(GLASS_BOOTS);
    }

    public static void registerModItems() {
        InvisibleArmor.LOGGER.info("Registering Mod Items for " + InvisibleArmor.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
