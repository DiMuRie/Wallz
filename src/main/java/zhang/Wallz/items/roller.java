package zhang.Wallz.items;

import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class roller extends Item {
	
	public roller(String unlocalizedName) {
		super();
        setRegistryName("roller");
        setUnlocalizedName("roller");     
        GameRegistry.registerItem(this);
        setCreativeTab(WallItems.tabWallz);
        setMaxStackSize(1);
	
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4)
    {
    par3List.add("Don`t botter pillaring up to build,right click this to fly!");
    par3List.add("OnItemRightClick you get cursed by the carpenter masters");
    par3List.add("To have half your speed and flight[rightclick]");
    }
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	par3EntityPlayer.capabilities.allowFlying = true;
	par3EntityPlayer.capabilities.setFlySpeed(0.05F);
	par3EntityPlayer.capabilities.setPlayerWalkSpeed(0.05F);
		 return par1ItemStack;
	}
	
}
