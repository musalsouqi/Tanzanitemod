package musalsou.tanzanite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static musalsou.tanzanite.RegisterItems.*;

public class TanzaniteMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("tanzanite");

	//creates the tanzanite item
	public static final Item CUSTOM_ITEM = new Tanzanite(new FabricItemSettings().maxCount(64));

	//creates tanzanite ore
	public static final Block CUSTOM_ORE  = new Block(FabricBlockSettings.create().strength(4.0f).requiresTool());


	public static ToolItem TANZANITE_SWORD = new SwordItem(TanzaniteToolMaterial.INSTANCE, 12, -2.4F, new Item.Settings());
	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("tanzanite","custom_ore"));
	@Override
	public void onInitialize() {


		//registers tanzanite item.
		Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_item"), CUSTOM_ITEM);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.add(CUSTOM_ITEM);
		});

		//registers ore and places it in world
		Registry.register(Registries.BLOCK, new Identifier("tanzanite", "custom_ore"), CUSTOM_ORE);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);
		RegisterItems.register();

		//Registers all weapons
		Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_sword"), TANZANITE_SWORD);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(TANZANITE_SWORD);
		});


		//registers all armor
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(CUSTOM_MATERIAL_HELMET);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(CUSTOM_MATERIAL_CHESTPLATE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(CUSTOM_MATERIAL_LEGGINGS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(CUSTOM_MATERIAL_BOOTS);
		});
		LOGGER.info("Hello Fabric world!");
	}
}