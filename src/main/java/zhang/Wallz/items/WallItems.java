package zhang.Wallz.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.Wallz.Reference;

public class WallItems {
	
	public static final CreativeTabs tabWallz = new CreativeTabs("wallz")
			{
    @Override public Item getTabIconItem() {
        return WallItems.roller;
    }
};

	public static ToolMaterial strondium = EnumHelper.addToolMaterial("aw", 3, 1233, 26F, 18.0F, 160);//h level,durability,miningspeed,atk dmg,enchantinility
	public static ToolMaterial lightz = EnumHelper.addToolMaterial("lightz", 3, 9999, 13F, 10F, 35);
	
	public static zhang.Wallz.items.roller roller;
	public static zhang.Wallz.items.superoller superoller;
	public static zhang.Wallz.items.lighthand lighthand;
	public static zhang.Wallz.items.reset reset;
	

    public static void init() {
        roller = new zhang.Wallz.items.roller(null);
        superoller = new zhang.Wallz.items.superoller(null);
        lighthand = new zhang.Wallz.items.lighthand(null, lightz);
        reset=new zhang.Wallz.items.reset(null);
    }

	public static void register()
	{
	GameRegistry.registerItem(roller);
	GameRegistry.registerItem(superoller);
	GameRegistry.registerItem(reset);
	}
	
	public static void RegisterItemRenders()
	{
		registerRender(roller);
		registerRender(superoller);
		registerRender(reset);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
