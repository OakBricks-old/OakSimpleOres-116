
package com.oakbricks.oakores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.oakbricks.oakores.item.PurpleOreItem;
import com.oakbricks.oakores.OaksimpleoresModElements;

@OaksimpleoresModElements.ModElement.Tag
public class OakoresCreativeTabItemGroup extends OaksimpleoresModElements.ModElement {
	public OakoresCreativeTabItemGroup(OaksimpleoresModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboakores_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PurpleOreItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
