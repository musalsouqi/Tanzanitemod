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
    public static final Block DEEPSLATE_CUSTOM_ORE  = new Block(FabricBlockSettings.create().strength(4.0f).requiresTool());
    public static final Item CUSTOM_ITEM = new Tanzanite(new FabricItemSettings().maxCount(64));
    public static ToolItem TANZANITE_SWORD = new SwordItem(TanzaniteToolMaterial.INSTANCE, 12, -2.4F, new Item.Settings());
    public static ToolItem TANZANITE_PICKAXE = new PickaxeItem(TanzanitePickAxe.INSTANCE,  2, -2.8F, new Item.Settings());

    public static final Item TANZANITE_AXE = new AxeItem(TanzaniteAxe.INSTANCE, 6.0f, -3.0f, new Item.Settings());
    public static final Item TANZANITE_SHOVEL = new ShovelItem(TanzaniteAxe.INSTANCE, 2.0f, -2.8f, new Item.Settings());
    public static final Block CUSTOM_BLOCK  = new Block(FabricBlockSettings.create().strength(4.0f));


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_helmet"), CUSTOM_MATERIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_chestplate"), CUSTOM_MATERIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_leggings"), CUSTOM_MATERIAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_boots"), CUSTOM_MATERIAL_BOOTS);
        //registers tanzanite item
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_item"), CUSTOM_ITEM);
        //registers ore
        Registry.register(Registries.BLOCK, new Identifier("tanzanite", "custom_ore"), CUSTOM_ORE);
        Registry.register(Registries.BLOCK, new Identifier("tanzanite", "deepslate_custom_ore"), DEEPSLATE_CUSTOM_ORE);
        //registers sword
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_sword"), TANZANITE_SWORD);
        //registers pickaxe
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_pickaxe"), TANZANITE_PICKAXE);
        //registers axe
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_axe"), TANZANITE_AXE);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "tanzanite_shovel"), TANZANITE_SHOVEL);
        //registers my block
        Registry.register(Registries.BLOCK, new Identifier("tanzanite", "custom_block"), CUSTOM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_block"), new BlockItem(CUSTOM_BLOCK, new FabricItemSettings()));

    }
}
