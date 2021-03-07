
package com.oakbricks.oakores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.oakbricks.oakores.itemgroup.OakoresCreativeTabItemGroup;
import com.oakbricks.oakores.OaksimpleoresModElements;

@OaksimpleoresModElements.ModElement.Tag
public class PurpiAxeItem extends OaksimpleoresModElements.ModElement {
	@ObjectHolder("oaksimpleores:purpi_axe")
	public static final Item block = null;
	public PurpiAxeItem(OaksimpleoresModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PurpleOreItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(OakoresCreativeTabItemGroup.tab)) {
		}.setRegistryName("purpi_axe"));
	}
}
