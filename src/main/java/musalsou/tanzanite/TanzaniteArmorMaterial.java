package musalsou.tanzanite;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TanzaniteArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {5, 8, 10, 5};



    @Override
    public int getDurability(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 500;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 500;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 500;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 500;}
        return 500;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        if(type.equals(ArmorItem.Type.BOOTS)){return 6;}
        else if (type.equals(ArmorItem.Type.LEGGINGS)){return 10;}
        else if (type.equals(ArmorItem.Type.CHESTPLATE)) {return 12;}
        else if (type.equals(ArmorItem.Type.HELMET)) {return 6;}
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
