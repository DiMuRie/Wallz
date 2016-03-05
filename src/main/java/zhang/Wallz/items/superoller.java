package zhang.Wallz.items;

import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class superoller extends Item {
	
	public superoller(String unlocalizedName) {
		super();
        setRegistryName("superoller");
        setUnlocalizedName("superoller");     
        GameRegistry.registerItem(this);
        setCreativeTab(WallItems.tabWallz);
        setMaxStackSize(1);
	
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4)
    {
	    par3List.add("Don`t botter pillaring up to build,right click this to fly!");
	    par3List.add("OnItemRightClick you get cursed by the cloud masters");
	    par3List.add("To have *5 your speed and flight[rightclick]");
    }
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	par3EntityPlayer.capabilities.allowFlying = true;
	par3EntityPlayer.capabilities.setFlySpeed(0.5F);
	par3EntityPlayer.capabilities.setPlayerWalkSpeed(0.5F);
		 return par1ItemStack;
	}
	
}
