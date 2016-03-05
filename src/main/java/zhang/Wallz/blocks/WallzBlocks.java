package zhang.Wallz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.Wallz.Reference;

public final class WallzBlocks {
	
    public static zhang.Wallz.blocks.clay_wall clay_wall;
    public static zhang.Wallz.blocks.floral_wall floral_wall;
    public static zhang.Wallz.blocks.house_wall house_wall;
    public static zhang.Wallz.blocks.rainbow_wall rainbow_wall;
    public static zhang.Wallz.blocks.wooden_wall wooden_wall;
    public static zhang.Wallz.blocks.spiral_stairs spiral_stairs;
    public static zhang.Wallz.blocks.rainleaf railing;
    public static zhang.Wallz.blocks.rbridge rbridge;
    public static zhang.Wallz.blocks.s4leaguefloor1 s4leaguefloor1;
    public static zhang.Wallz.blocks.s4leaguefloor2 s4leaguefloor2;
    public static zhang.Wallz.blocks.WallzContainer wallsafe;
    
    public static void init() {
        clay_wall = new clay_wall(Material.iron);
        floral_wall=new floral_wall(Material.cloth);
        house_wall=new house_wall(Material.rock);
        rainbow_wall=new rainbow_wall(Material.rock);
        wooden_wall=new wooden_wall(Material.cloth);
        spiral_stairs=new spiral_stairs(Material.clay);
        railing=new rainleaf(Material.cloth);
        rbridge=new rbridge(Material.wood);
        s4leaguefloor1= new s4leaguefloor1(Material.rock);
        s4leaguefloor2= new s4leaguefloor2(Material.wood);
        wallsafe= new WallzContainer();
    }
    public static void register()
    {
    	GameRegistry.registerBlock(clay_wall, clay_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(floral_wall, floral_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(house_wall, house_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(rainbow_wall, rainbow_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(wooden_wall, wooden_wall.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(spiral_stairs, spiral_stairs.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(railing, railing.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(rbridge, rbridge.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(s4leaguefloor1, s4leaguefloor1.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(s4leaguefloor2, s4leaguefloor2.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(wallsafe, wallsafe.getUnlocalizedName().substring(5));
    }
    public static void registerRenders()
    {
    	registerRender(clay_wall);
    	registerRender(floral_wall);
    	registerRender(house_wall);
    	registerRender(rainbow_wall);
    	registerRender(wooden_wall);
    	registerRender(spiral_stairs);
    	registerRender(railing);
    	registerRender(rbridge);
    	registerRender(s4leaguefloor1);
    	registerRender(s4leaguefloor2);
    	registerRender(wallsafe);
    }
    
    public static void registerRender(Block block)
    {
    	Item item = Item.getItemFromBlock(block);
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
    
    
}

