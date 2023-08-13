package musalsou.tanzanite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class RegisterItems {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new TanzaniteArmorMaterial();
    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final Block CUSTOM_ORE  = new Block(FabricBlockSettings.create().strength(4.0f).requiresTool());
    public static final Item CUSTOM_ITEM = new Tanzanite(new FabricItemSettings().maxCount(64));
    public static ToolItem TANZANITE_SWORD = new SwordItem(TanzaniteToolMaterial.INSTANCE, 12, -2.4F, new Item.Settings());


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_helmet"), CUSTOM_MATERIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_chestplate"), CUSTOM_MATERIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_leggings"), CUSTOM_MATERIAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_boots"), CUSTOM_MATERIAL_BOOTS);
        //registers tanzanite item
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_item"), CUSTOM_ITEM);
        //registers ore
        Registry.register(Registries.BLOCK, new Identifier("tanzanite", "custom_ore"), CUSTOM_ORE);
        //registers sword
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_sword"), TANZANITE_SWORD);
    }
}
