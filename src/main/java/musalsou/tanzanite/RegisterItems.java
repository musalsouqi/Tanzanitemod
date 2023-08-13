package musalsou.tanzanite;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterItems {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new PurpleArmorMaterial();
    // If you made a new material, this is where you would note it.
    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_helmet"), CUSTOM_MATERIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_chestplate"), CUSTOM_MATERIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_leggings"), CUSTOM_MATERIAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("tanzanite", "custom_material_boots"), CUSTOM_MATERIAL_BOOTS);
    }
}
