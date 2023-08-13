package musalsou.tanzanite;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class PurpleArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {5, 8, 10, 5};



    @Override
    public int getDurability(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 13;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 15;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 16;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 16;}
        return 15;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 5;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 8;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 10;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 5;}
        return 15;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return Ingredient.EMPTY;
    }

    @Override
    public String getName() {
        return "gilded";
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
