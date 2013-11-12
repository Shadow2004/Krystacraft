package krystacraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import krystacraft.lib.ItemIds;
import krystacraft.lib.Strings;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class Items {
	
	public static EnumToolMaterial sodalite;
	
	public static Item krystaDust;
	public static Item smallCrystal;
	public static Item soldalitePickaxe;
	public static Item aquamarineCrystalLarge;
	public static Item aquamarineCrystal;
	public static Item berylCrystalLarge;
	public static Item berylCrystal;
	public static Item chalcedonyCrystalLarge;
	public static Item chalcedonyCrystal;
	public static Item endTopazCrystalLarge;
	public static Item endTopazCrystal;
	public static Item fireOpalCrystalLarge;
	public static Item fireOpalCrystal;
	public static Item hackmaniteCrystalLarge;
	public static Item hackmaniteCrystal;
	public static Item jadeCrystalLarge;
	public static Item jadeCrystal;
	public static Item malachiteCrystalLarge;
	public static Item malachiteCrystal;
	public static Item netherGarnetCrystalLarge;
	public static Item netherGarnetCrystal;
	public static Item onyxCrystalLarge;
	public static Item onyxCrystal;
	public static Item rhodoliteCrystalLarge;
	public static Item rhodoliteCrystal;
	public static Item roseQuartzCrystalLarge;
	public static Item roseQuartzCrystal;
	public static Item sodaliteCrystalLarge;
	public static Item sodaliteCrystal;
	public static Item sugiliteCrystalLarge;
	public static Item sugiliteCrystal;
	public static Item tanzaniteCrystalLarge;
	public static Item tanzaniteCrystal;
	public static Item tourmalineCrystalLarge;
	public static Item tourmalineCrystal;
	
	public static void init() {
		krystaDust 			= new ItemKrystaDust(ItemIds.KrystaDust_Default);
		smallCrystal 		= new ItemSmallCrystal(ItemIds.SmallCrystal_Default);
		aquamarineCrystalLarge 	= new ItemAquamarineCrystalLarge(ItemIds.AquamarineCrystalLarge_Default);
		aquamarineCrystal 	= new ItemAquamarineCrystal(ItemIds.AquamarineCrystal_Default);
		berylCrystalLarge 	= new ItemBerylCrystalLarge(ItemIds.BerylCrystalLarge_Default);
		berylCrystal 	    = new ItemBerylCrystal(ItemIds.BerylCrystal_Default);
		chalcedonyCrystalLarge 	= new ItemChalcedonyCrystalLarge(ItemIds.ChalcedonyCrystalLarge_Default);
		chalcedonyCrystal 	= new ItemChalcedonyCrystal(ItemIds.ChalcedonyCrystal_Default);
		endTopazCrystalLarge 	= new ItemEndTopazCrystalLarge(ItemIds.EndTopazCrystalLarge_Default);
		endTopazCrystal 	= new ItemEndTopazCrystal(ItemIds.EndTopazCrystal_Default);
		fireOpalCrystalLarge 	= new ItemFireOpalCrystalLarge(ItemIds.FireOpalCrystalLarge_Default);
		fireOpalCrystal 	= new ItemFireOpalCrystal(ItemIds.FireOpalCrystal_Default);
		hackmaniteCrystalLarge 	= new ItemHackmaniteCrystalLarge(ItemIds.HackmaniteCrystalLarge_Default);
		hackmaniteCrystal 	= new ItemHackmaniteCrystal(ItemIds.HackmaniteCrystal_Default);
		jadeCrystalLarge 	= new ItemJadeCrystalLarge(ItemIds.JadeCrystalLarge_Default);
		jadeCrystal 	    = new ItemJadeCrystal(ItemIds.JadeCrystal_Default);
		malachiteCrystalLarge 	= new ItemMalachiteCrystalLarge(ItemIds.MalachiteCrystalLarge_Default);
		malachiteCrystal 	= new ItemMalachiteCrystal(ItemIds.MalachiteCrystal_Default);
		netherGarnetCrystalLarge  = new ItemNetherGarnetCrystalLarge(ItemIds.NetherGarnetCrystalLarge_Default);
		netherGarnetCrystal 	= new ItemNetherGarnetCrystal(ItemIds.NetherGarnetCrystal_Default);
		onyxCrystalLarge 	= new ItemOnyxCrystalLarge(ItemIds.OnyxCrystalLarge_Default);
		onyxCrystal 	    = new ItemOnyxCrystal(ItemIds.OnyxCrystal_Default);
		rhodoliteCrystalLarge 	= new ItemRhodoliteCrystalLarge(ItemIds.RhodoliteCrystalLarge_Default);
		rhodoliteCrystal 	= new ItemRhodoliteCrystal(ItemIds.RhodoliteCrystal_Default);
		roseQuartzCrystalLarge 	= new ItemRoseQuartzCrystalLarge(ItemIds.RoseQuartzCrystalLarge_Default);
		roseQuartzCrystal 	= new ItemRoseQuartzCrystal(ItemIds.RoseQuartzCrystal_Default);
		sodaliteCrystal 	= new ItemSodaliteCrystal(ItemIds.SodaliteCrystal_Default);
		sodaliteCrystalLarge 	= new ItemSodaliteCrystalLarge(ItemIds.SodaliteCrystalLarge_Default);
		sugiliteCrystal 	= new ItemSugiliteCrystal(ItemIds.SugiliteCrystal_Default);
		sugiliteCrystalLarge 	= new ItemSugiliteCrystalLarge(ItemIds.SugiliteCrystalLarge_Default);
		tanzaniteCrystal 	= new ItemTanzaniteCrystal(ItemIds.TanzaniteCrystal_Default);
		tanzaniteCrystalLarge 	= new ItemTanzaniteCrystalLarge(ItemIds.TanzaniteCrystalLarge_Default);
		tourmalineCrystal 	= new ItemTourmalineCrystal(ItemIds.TourmalineCrystal_Default);
		tourmalineCrystalLarge 	= new ItemTourmalineCrystalLarge(ItemIds.TourmalineCrystalLarge_Default);
		
		
		sodalite = EnumHelper.addToolMaterial("SodalitePickaxe", 2, 1200, 10.0F, 6.0F, 18);
		soldalitePickaxe 	= new ItemSodalitePickaxe(ItemIds.SodalitePickaxe_Default, sodalite);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(krystaDust, Strings.ItemKrystaDust_name);
		LanguageRegistry.addName(smallCrystal, Strings.ItemSmallCrystal_name);
		LanguageRegistry.addName(sodaliteCrystal, Strings.ItemSodaliteCrystal_name);
		LanguageRegistry.addName(soldalitePickaxe, Strings.ItemSodalitePickaxe_name);
		LanguageRegistry.addName(aquamarineCrystalLarge, Strings.ItemAquamarineCrystalLarge_name);
		LanguageRegistry.addName(aquamarineCrystal, Strings.ItemAquamarineCrystal_name);
		LanguageRegistry.addName(berylCrystalLarge, Strings.ItemBerylCrystalLarge_name);
		LanguageRegistry.addName(berylCrystal, Strings.ItemBerylCrystal_name);
		LanguageRegistry.addName(chalcedonyCrystalLarge, Strings.ItemChalcedonyCrystalLarge_name);
		LanguageRegistry.addName(chalcedonyCrystal, Strings.ItemChalcedonyCrystal_name);
		LanguageRegistry.addName(endTopazCrystalLarge, Strings.ItemEndTopazCrystalLarge_name);
		LanguageRegistry.addName(endTopazCrystal, Strings.ItemEndTopazCrystal_name);
		LanguageRegistry.addName(fireOpalCrystalLarge, Strings.ItemFireOpalCrystalLarge_name);
		LanguageRegistry.addName(fireOpalCrystal, Strings.ItemFireOpalCrystal_name);
		LanguageRegistry.addName(hackmaniteCrystalLarge, Strings.ItemHackmaniteCrystalLarge_name);
		LanguageRegistry.addName(hackmaniteCrystal, Strings.ItemHackmaniteCrystal_name);
		LanguageRegistry.addName(jadeCrystalLarge, Strings.ItemJadeCrystalLarge_name);
		LanguageRegistry.addName(jadeCrystal, Strings.ItemJadeCrystal_name);
		LanguageRegistry.addName(malachiteCrystalLarge, Strings.ItemMalachiteCrystalLarge_name);
		LanguageRegistry.addName(malachiteCrystal, Strings.ItemMalachiteCrystal_name);
		LanguageRegistry.addName(netherGarnetCrystalLarge, Strings.ItemNetherGarnetCrystalLarge_name);
		LanguageRegistry.addName(netherGarnetCrystal, Strings.ItemNetherGarnetCrystal_name);
		LanguageRegistry.addName(onyxCrystalLarge, Strings.ItemOnyxCrystalLarge_name);
		LanguageRegistry.addName(onyxCrystal, Strings.ItemOnyxCrystal_name);
		LanguageRegistry.addName(rhodoliteCrystalLarge, Strings.ItemRhodoliteCrystalLarge_name);
		LanguageRegistry.addName(rhodoliteCrystal, Strings.ItemRhodoliteCrystal_name);
		LanguageRegistry.addName(roseQuartzCrystalLarge, Strings.ItemRoseQuartzCrystalLarge_name);
		LanguageRegistry.addName(roseQuartzCrystal, Strings.ItemRoseQuartzCrystal_name);
		LanguageRegistry.addName(sodaliteCrystalLarge, Strings.ItemSodaliteCrystalLarge_name);
		LanguageRegistry.addName(sodaliteCrystal, Strings.ItemSodaliteCrystal_name);
		LanguageRegistry.addName(sugiliteCrystalLarge, Strings.ItemSugiliteCrystalLarge_name);
		LanguageRegistry.addName(sugiliteCrystal, Strings.ItemSugiliteCrystal_name);
		LanguageRegistry.addName(tanzaniteCrystalLarge, Strings.ItemTanzaniteCrystalLarge_name);
		LanguageRegistry.addName(tanzaniteCrystal, Strings.ItemTanzaniteCrystal_name);
		LanguageRegistry.addName(tourmalineCrystalLarge, Strings.ItemTourmalineCrystalLarge_name);
		LanguageRegistry.addName(tourmalineCrystal, Strings.ItemTourmalineCrystal_name);
	}
	
}
