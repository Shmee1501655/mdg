
package net.mcreator.mdg.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;

import net.mcreator.mdg.MdgMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class DoomOnASpoonJustTheBeginningMusicDisc extends MusicDiscItem {
	public DoomOnASpoonJustTheBeginningMusicDisc() {
		super(0, (net.minecraft.sound.SoundEvent) MdgMod.doom_on_a_spoon_just_the_beginningEvent,
				new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE));
	}
}
