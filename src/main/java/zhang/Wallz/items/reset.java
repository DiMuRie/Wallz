package zhang.Wallz.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class reset extends Item {

	public reset(String unlocalizedName) {
		super();
        setRegistryName("reset");
        setUnlocalizedName("reset");     
        GameRegistry.registerItem(this);
        setCreativeTab(WallItems.tabWallz);
        setMaxStackSize(1);
	
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4)
    {
    par3List.add("Reset your speed");
    par3List.add("also will set your flight speed like creative[right click]");
    }
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	par3EntityPlayer.capabilities.allowFlying = true;
	par3EntityPlayer.capabilities.setFlySpeed(0.11F);
	par3EntityPlayer.capabilities.setPlayerWalkSpeed(0.11F);
		 return par1ItemStack;
	}
	
}
