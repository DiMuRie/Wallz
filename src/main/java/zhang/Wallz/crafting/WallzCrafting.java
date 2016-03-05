package zhang.Wallz.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zhang.Wallz.blocks.WallzBlocks;
import zhang.Wallz.items.WallItems;

public final class WallzCrafting {
	
	
	public static void initCrafting() {
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.clay_wall, 16), new Object[] {"###", " G ", "###", '#', Blocks.hardened_clay, 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.floral_wall, 16), new Object[] {"###", " G ", "###", '#', Blocks.grass , 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.house_wall, 64), new Object[] {"###", " G ", "###", '#', Blocks.lapis_ore , 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.rainbow_wall, 16), new Object[] {"###", " G ", "###", '#', Items.dye , 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.wooden_wall, 64), new Object[] {"###", " G ", "###", '#', Blocks.wooden_slab , 'G', Items.paper});
	GameRegistry.addRecipe(new ItemStack(WallItems.roller), new Object[] {"###", " G ", "###", '#', Blocks.diamond_ore , 'G', Items.nether_star});
	GameRegistry.addRecipe(new ItemStack(WallItems.superoller), new Object[] {"###", " G ", "###", '#', Blocks.diamond_block , 'G', Blocks.dragon_egg});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.spiral_stairs, 64), new Object[] {"###", " G#", "###", '#', Blocks.hardened_clay , 'G', Blocks.glowstone});
	GameRegistry.addRecipe(new ItemStack(WallItems.lighthand), new Object[] {"###", " G#", "###", '#', Blocks.ice , 'G', Items.nether_star});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.railing, 32), new Object[] {"lll", "ldl", "lll", 'l',Blocks.leaves, 'd', Items.dye});
	GameRegistry.addRecipe(new ItemStack(WallItems.reset), new Object[] {"lll", "ldl", "lll", 'l',Blocks.activator_rail, 'd', Items.carrot_on_a_stick});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.rbridge, 16), new Object[] {"lll", " d ", "lll", 'l',Blocks.planks, 'd', Items.lead});
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.s4leaguefloor1, 16), new Object[] {"lll", "lll", "lll", 'l',Blocks.planks});	
	GameRegistry.addRecipe(new ItemStack(WallzBlocks.s4leaguefloor2, 16), new Object[] {"lll", "lll", "lll", 'l',Blocks.planks});
	}
}
