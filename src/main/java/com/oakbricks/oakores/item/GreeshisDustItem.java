
package com.oakbricks.oakores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.oakbricks.oakores.itemgroup.OakoresCreativeTabItemGroup;
import com.oakbricks.oakores.OaksimpleoresModElements;

@OaksimpleoresModElements.ModElement.Tag
public class GreeshisDustItem extends OaksimpleoresModElements.ModElement {
	@ObjectHolder("oaksimpleores:greeshis_dust")
	public static final Item block = null;
	public GreeshisDustItem(OaksimpleoresModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OakoresCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("greeshis_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
