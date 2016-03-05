package zhang.Wallz;


import org.apache.logging.log4j.Logger;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zhang.Wallz.blocks.WallzBlocks;
import zhang.Wallz.crafting.WallzCrafting;
import zhang.Wallz.items.WallItems;
import zhang.Wallz.proxy.CommonProxy;
import zhang.Wallz.tileentiy.WallzTileEntitys;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, dependencies = "required-after:Forge@[11.15.1.1738,)", useMetadata = true)

public class WallzMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	    @Mod.Instance
	    public static WallzMod instance;

	    public static Logger logger;

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        WallzBlocks.init();
	    	WallzBlocks.register();
	    	WallItems.init();
	    	WallItems.register();
	    	WallzTileEntitys.init();
	    	OBJLoader.instance.addDomain(Reference.MOD_ID);
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent e) {
	    	proxy.registerRenders();
	    	WallzCrafting.initCrafting();
	    	
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    	
	    	
	    }
}
