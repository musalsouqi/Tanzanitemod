package musalsou.tanzanite;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TanzaniteArmorMaterial implements ArmorMaterial {



    @Override
    public int getDurability(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 250;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 250;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 250;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 250;}
        return 500;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 3;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 6;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 8;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 3;}
        return 15;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return Ingredient.ofItems(RegisterItems.CUSTOM_ITEM);
    }

    @Override
    public String getName() {
        return "tanzanite";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
