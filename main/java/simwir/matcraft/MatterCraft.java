package simwir.matcraft;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import simwir.matcraft.items.ItemTable;
import simwir.matcraft.lib.ItemReferrences;
import simwir.matcraft.lib.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class MatterCraft {
	@Instance(References.MOD_ID)
	public static MatterCraft instance;
	// Defining blocks
	//\public static Block waterSource;
	// Defining Items
	public static Item table;
	// Defining other
	public static boolean debug;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		debug = config.get("Other", "Debug", false, References.DEBUG_CONFIG_COMMENT).getBoolean(false);
		config.save();
		// Adding blocks and items to the actual game
		// Blocks
		//\waterSource = new BlockWaterSource();
		// Items
		//\meter = new ItemMeter();
		table = new ItemTable();
		gameRegisters();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	private static void gameRegisters() {

		// Registers blocks to the game.
		//\GameRegistry.registerBlock(waterSource, BlockReferences.WATER_SOURCE_UNC_NAME);
		//Registeres items to the game
		GameRegistry.registerItem(table, ItemReferrences.ITEM_TABLE_UNC_NAME);
	}
	private void registerTileEntities() {

		//\GameRegistry.registerTileEntity(TileSmallTank.class, BlockReferences.SMALL_TANK_TE_KEY);
	}
	
	
}
