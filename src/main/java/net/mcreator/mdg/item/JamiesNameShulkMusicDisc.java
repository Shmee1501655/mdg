
package net.mcreator.mdg.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;

import net.mcreator.mdg.MdgMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class JamiesNameShulkMusicDisc extends MusicDiscItem {
	public JamiesNameShulkMusicDisc() {
		super(0, (net.minecraft.sound.SoundEvent) MdgMod.jamiesname_shulkEvent,
				new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE));
	}
}
