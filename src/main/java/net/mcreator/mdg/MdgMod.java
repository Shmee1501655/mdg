/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.mdg;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.Item;

import net.mcreator.mdg.item.TheTimebreakerWorldBowzerMusicDisc;
import net.mcreator.mdg.item.SynthionAbleSistersMusicDisc;
import net.mcreator.mdg.item.ShroomMusicDisc;
import net.mcreator.mdg.item.RainMusicDisc;
import net.mcreator.mdg.item.Player2LifelightMusicDisc;
import net.mcreator.mdg.item.Pikpik36IceMusicDisc;
import net.mcreator.mdg.item.MikelTBEFairyFountainMusicDisc;
import net.mcreator.mdg.item.MallowTeaLemonglassMusicDisc;
import net.mcreator.mdg.item.JungleMusicDisc;
import net.mcreator.mdg.item.JamiesNameTallMusicDisc;
import net.mcreator.mdg.item.JamiesNameShulkMusicDisc;
import net.mcreator.mdg.item.JamiesNamePillagedMusicDisc;
import net.mcreator.mdg.item.JamiesName18MusicDisc;
import net.mcreator.mdg.item.Helynt1RainbowRoadMusicDisc;
import net.mcreator.mdg.item.Helynt1OverworldMusicDisc;
import net.mcreator.mdg.item.Helynt1GustyGardensMusicDisc;
import net.mcreator.mdg.item.GwydBricksMusicDisc;
import net.mcreator.mdg.item.GreenBurningClayMusicDisc;
import net.mcreator.mdg.item.FirchRangeMusicDisc;
import net.mcreator.mdg.item.FirchChopMusicDisc;
import net.mcreator.mdg.item.FirchAntiMusicDisc;
import net.mcreator.mdg.item.EpicurasCradleMusicDisc;
import net.mcreator.mdg.item.DoomOnASpoonWardenMusicDisc;
import net.mcreator.mdg.item.DoomOnASpoonVengefulMusicDisc;
import net.mcreator.mdg.item.DoomOnASpoonTideMusicDisc;
import net.mcreator.mdg.item.DoomOnASpoonSeedsMusicDisc;
import net.mcreator.mdg.item.DoomOnASpoonJustTheBeginningMusicDisc;
import net.mcreator.mdg.item.DeesasterFloatMusicDisc;
import net.mcreator.mdg.item.DJCutmanWiiShopMusicDisc;
import net.mcreator.mdg.item.ActivateMusicDisc;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class MdgMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Identifier jamiesname_shulk_ID = id("jamiesname_shulk");
	public static final SoundEvent jamiesname_shulkEvent = new SoundEvent(jamiesname_shulk_ID);
	public static final Identifier jamiesname_18_ID = id("jamiesname_18");
	public static final SoundEvent jamiesname_18Event = new SoundEvent(jamiesname_18_ID);
	public static final Identifier jamiesname_tall_ID = id("jamiesname_tall");
	public static final SoundEvent jamiesname_tallEvent = new SoundEvent(jamiesname_tall_ID);
	public static final Identifier jamiesname_pillaged_ID = id("jamiesname_pillaged");
	public static final SoundEvent jamiesname_pillagedEvent = new SoundEvent(jamiesname_pillaged_ID);
	public static final Identifier pikpik36_ice_ID = id("pikpik36_ice");
	public static final SoundEvent pikpik36_iceEvent = new SoundEvent(pikpik36_ice_ID);
	public static final Identifier gwyd_bricks_ID = id("gwyd_bricks");
	public static final SoundEvent gwyd_bricksEvent = new SoundEvent(gwyd_bricks_ID);
	public static final Identifier mallowtea_lemonglass_ID = id("mallowtea_lemonglass");
	public static final SoundEvent mallowtea_lemonglassEvent = new SoundEvent(mallowtea_lemonglass_ID);
	public static final Identifier epicuras_cradle_ID = id("epicuras_cradle");
	public static final SoundEvent epicuras_cradleEvent = new SoundEvent(epicuras_cradle_ID);
	public static final Identifier greenburning_clay_ID = id("greenburning_clay");
	public static final SoundEvent greenburning_clayEvent = new SoundEvent(greenburning_clay_ID);
	public static final Identifier synthion_able_sisters_ID = id("synthion_able_sisters");
	public static final SoundEvent synthion_able_sistersEvent = new SoundEvent(synthion_able_sisters_ID);
	public static final Identifier thetimebreaker_wbesr_ID = id("thetimebreaker_wbesr");
	public static final SoundEvent thetimebreaker_wbesrEvent = new SoundEvent(thetimebreaker_wbesr_ID);
	public static final Identifier djcutman_wii_shop_ID = id("djcutman_wii_shop");
	public static final SoundEvent djcutman_wii_shopEvent = new SoundEvent(djcutman_wii_shop_ID);
	public static final Identifier helynt1_gusty_gardens_ID = id("helynt1_gusty_gardens");
	public static final SoundEvent helynt1_gusty_gardensEvent = new SoundEvent(helynt1_gusty_gardens_ID);
	public static final Identifier player2_lifelight_ID = id("player2_lifelight");
	public static final SoundEvent player2_lifelightEvent = new SoundEvent(player2_lifelight_ID);
	public static final Identifier doom_on_a_spoon_seeds_ID = id("doom_on_a_spoon_seeds");
	public static final SoundEvent doom_on_a_spoon_seedsEvent = new SoundEvent(doom_on_a_spoon_seeds_ID);
	public static final Identifier doom_on_a_spoon_warden_ID = id("doom_on_a_spoon_warden");
	public static final SoundEvent doom_on_a_spoon_wardenEvent = new SoundEvent(doom_on_a_spoon_warden_ID);
	public static final Identifier helynt1_overworld_ID = id("helynt1_overworld");
	public static final SoundEvent helynt1_overworldEvent = new SoundEvent(helynt1_overworld_ID);
	public static final Identifier mikeltbe_fairy_fountain_ID = id("mikeltbe_fairy_fountain");
	public static final SoundEvent mikeltbe_fairy_fountainEvent = new SoundEvent(mikeltbe_fairy_fountain_ID);
	public static final Identifier helynt1_rainbow_road_ID = id("helynt1_rainbow_road");
	public static final SoundEvent helynt1_rainbow_roadEvent = new SoundEvent(helynt1_rainbow_road_ID);
	public static final Identifier doom_on_a_spoon_tide_ID = id("doom_on_a_spoon_tide");
	public static final SoundEvent doom_on_a_spoon_tideEvent = new SoundEvent(doom_on_a_spoon_tide_ID);
	public static final Identifier doom_on_a_spoon_vengeful_ID = id("doom_on_a_spoon_vengeful");
	public static final SoundEvent doom_on_a_spoon_vengefulEvent = new SoundEvent(doom_on_a_spoon_vengeful_ID);
	public static final Identifier firch_anti_ID = id("firch_anti");
	public static final SoundEvent firch_antiEvent = new SoundEvent(firch_anti_ID);
	public static final Identifier firch_chop_ID = id("firch_chop");
	public static final SoundEvent firch_chopEvent = new SoundEvent(firch_chop_ID);
	public static final Identifier firch_range_ID = id("firch_range");
	public static final SoundEvent firch_rangeEvent = new SoundEvent(firch_range_ID);
	public static final Identifier doom_on_a_spoon_just_the_beginning_ID = id("doom_on_a_spoon_just_the_beginning");
	public static final SoundEvent doom_on_a_spoon_just_the_beginningEvent = new SoundEvent(doom_on_a_spoon_just_the_beginning_ID);
	public static final Identifier kazyumayui_activate_ID = id("kazyumayui_activate");
	public static final SoundEvent kazyumayui_activateEvent = new SoundEvent(kazyumayui_activate_ID);
	public static final Identifier kazyumayui_jungle_ID = id("kazyumayui_jungle");
	public static final SoundEvent kazyumayui_jungleEvent = new SoundEvent(kazyumayui_jungle_ID);
	public static final Identifier kazyumayui_rain_ID = id("kazyumayui_rain");
	public static final SoundEvent kazyumayui_rainEvent = new SoundEvent(kazyumayui_rain_ID);
	public static final Identifier kazyumayui_shroom_ID = id("kazyumayui_shroom");
	public static final SoundEvent kazyumayui_shroomEvent = new SoundEvent(kazyumayui_shroom_ID);
	public static final Identifier deesaster_float_ID = id("deesaster_float");
	public static final SoundEvent deesaster_floatEvent = new SoundEvent(deesaster_float_ID);
	public static final Item JamiesNameShulk_ITEM = Registry.register(Registry.ITEM, id("jamies_name_shulk"), new JamiesNameShulkMusicDisc());
	public static final Item JamiesName18_ITEM = Registry.register(Registry.ITEM, id("jamies_name_18"), new JamiesName18MusicDisc());
	public static final Item JamiesNameTall_ITEM = Registry.register(Registry.ITEM, id("jamies_name_tall"), new JamiesNameTallMusicDisc());
	public static final Item JamiesNamePillaged_ITEM = Registry.register(Registry.ITEM, id("jamies_name_pillaged"),
			new JamiesNamePillagedMusicDisc());
	public static final Item Pikpik36Ice_ITEM = Registry.register(Registry.ITEM, id("pikpik_36_ice"), new Pikpik36IceMusicDisc());
	public static final Item SynthionAbleSisters_ITEM = Registry.register(Registry.ITEM, id("synthion_able_sisters"),
			new SynthionAbleSistersMusicDisc());
	public static final Item GreenBurningClay_ITEM = Registry.register(Registry.ITEM, id("green_burning_clay"), new GreenBurningClayMusicDisc());
	public static final Item GwydBricks_ITEM = Registry.register(Registry.ITEM, id("gwyd_bricks"), new GwydBricksMusicDisc());
	public static final Item EpicurasCradle_ITEM = Registry.register(Registry.ITEM, id("epicuras_cradle"), new EpicurasCradleMusicDisc());
	public static final Item MallowTeaLemonglass_ITEM = Registry.register(Registry.ITEM, id("mallow_tea_lemonglass"),
			new MallowTeaLemonglassMusicDisc());
	public static final Item TheTimebreakerWorldBowzer_ITEM = Registry.register(Registry.ITEM, id("the_timebreaker_world_bowzer"),
			new TheTimebreakerWorldBowzerMusicDisc());
	public static final Item DJCutmanWiiShop_ITEM = Registry.register(Registry.ITEM, id("dj_cutman_wii_shop"), new DJCutmanWiiShopMusicDisc());
	public static final Item Helynt1GustyGardens_ITEM = Registry.register(Registry.ITEM, id("helynt_1_gusty_gardens"),
			new Helynt1GustyGardensMusicDisc());
	public static final Item Player2Lifelight_ITEM = Registry.register(Registry.ITEM, id("player_2_lifelight"), new Player2LifelightMusicDisc());
	public static final Item DoomOnASpoonSeeds_ITEM = Registry.register(Registry.ITEM, id("doom_on_a_spoon_seeds"), new DoomOnASpoonSeedsMusicDisc());
	public static final Item DoomOnASpoonWarden_ITEM = Registry.register(Registry.ITEM, id("doom_on_a_spoon_warden"),
			new DoomOnASpoonWardenMusicDisc());
	public static final Item Helynt1Overworld_ITEM = Registry.register(Registry.ITEM, id("helynt_1_overworld"), new Helynt1OverworldMusicDisc());
	public static final Item MikelTBEFairyFountain_ITEM = Registry.register(Registry.ITEM, id("mikel_tbe_fairy_fountain"),
			new MikelTBEFairyFountainMusicDisc());
	public static final Item Helynt1RainbowRoad_ITEM = Registry.register(Registry.ITEM, id("helynt_1_rainbow_road"),
			new Helynt1RainbowRoadMusicDisc());
	public static final Item DoomOnASpoonJustTheBeginning_ITEM = Registry.register(Registry.ITEM, id("doom_on_a_spoon_just_the_beginning"),
			new DoomOnASpoonJustTheBeginningMusicDisc());
	public static final Item DoomOnASpoonTide_ITEM = Registry.register(Registry.ITEM, id("doom_on_a_spoon_tide"), new DoomOnASpoonTideMusicDisc());
	public static final Item DoomOnASpoonVengeful_ITEM = Registry.register(Registry.ITEM, id("doom_on_a_spoon_vengeful"),
			new DoomOnASpoonVengefulMusicDisc());
	public static final Item FirchAnti_ITEM = Registry.register(Registry.ITEM, id("firch_anti"), new FirchAntiMusicDisc());
	public static final Item FirchChop_ITEM = Registry.register(Registry.ITEM, id("firch_chop"), new FirchChopMusicDisc());
	public static final Item FirchRange_ITEM = Registry.register(Registry.ITEM, id("firch_range"), new FirchRangeMusicDisc());
	public static final Item Shroom_ITEM = Registry.register(Registry.ITEM, id("shroom"), new ShroomMusicDisc());
	public static final Item Jungle_ITEM = Registry.register(Registry.ITEM, id("jungle"), new JungleMusicDisc());
	public static final Item Rain_ITEM = Registry.register(Registry.ITEM, id("rain"), new RainMusicDisc());
	public static final Item Activate_ITEM = Registry.register(Registry.ITEM, id("activate"), new ActivateMusicDisc());
	public static final Item DeesasterFloat_ITEM = Registry.register(Registry.ITEM, id("deesaster_float"), new DeesasterFloatMusicDisc());
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MdgMod");
		Registry.register(Registry.SOUND_EVENT, MdgMod.jamiesname_shulk_ID, MdgMod.jamiesname_shulkEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.jamiesname_18_ID, MdgMod.jamiesname_18Event);
		Registry.register(Registry.SOUND_EVENT, MdgMod.jamiesname_tall_ID, MdgMod.jamiesname_tallEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.jamiesname_pillaged_ID, MdgMod.jamiesname_pillagedEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.pikpik36_ice_ID, MdgMod.pikpik36_iceEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.gwyd_bricks_ID, MdgMod.gwyd_bricksEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.mallowtea_lemonglass_ID, MdgMod.mallowtea_lemonglassEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.epicuras_cradle_ID, MdgMod.epicuras_cradleEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.greenburning_clay_ID, MdgMod.greenburning_clayEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.synthion_able_sisters_ID, MdgMod.synthion_able_sistersEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.thetimebreaker_wbesr_ID, MdgMod.thetimebreaker_wbesrEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.djcutman_wii_shop_ID, MdgMod.djcutman_wii_shopEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.helynt1_gusty_gardens_ID, MdgMod.helynt1_gusty_gardensEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.player2_lifelight_ID, MdgMod.player2_lifelightEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.doom_on_a_spoon_seeds_ID, MdgMod.doom_on_a_spoon_seedsEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.doom_on_a_spoon_warden_ID, MdgMod.doom_on_a_spoon_wardenEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.helynt1_overworld_ID, MdgMod.helynt1_overworldEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.mikeltbe_fairy_fountain_ID, MdgMod.mikeltbe_fairy_fountainEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.helynt1_rainbow_road_ID, MdgMod.helynt1_rainbow_roadEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.doom_on_a_spoon_tide_ID, MdgMod.doom_on_a_spoon_tideEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.doom_on_a_spoon_vengeful_ID, MdgMod.doom_on_a_spoon_vengefulEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.firch_anti_ID, MdgMod.firch_antiEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.firch_chop_ID, MdgMod.firch_chopEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.firch_range_ID, MdgMod.firch_rangeEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.doom_on_a_spoon_just_the_beginning_ID, MdgMod.doom_on_a_spoon_just_the_beginningEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.kazyumayui_activate_ID, MdgMod.kazyumayui_activateEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.kazyumayui_jungle_ID, MdgMod.kazyumayui_jungleEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.kazyumayui_rain_ID, MdgMod.kazyumayui_rainEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.kazyumayui_shroom_ID, MdgMod.kazyumayui_shroomEvent);
		Registry.register(Registry.SOUND_EVENT, MdgMod.deesaster_float_ID, MdgMod.deesaster_floatEvent);
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("mdg", s);
	}
}
