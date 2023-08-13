package musalsou.tanzanite;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TanzaniteToolMaterial implements ToolMaterial {
    public static final TanzaniteToolMaterial INSTANCE = new TanzaniteToolMaterial();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }



    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.CUSTOM_ITEM);
    }
}
