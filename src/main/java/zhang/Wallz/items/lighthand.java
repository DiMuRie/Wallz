package zhang.Wallz.items;

import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class lighthand extends ItemSpade implements IWallzReach {

	public lighthand(String unlocalizedName, ToolMaterial lightz) {
		super(lightz);
        setRegistryName("lighthand");
        setUnlocalizedName("lighthand");     
        GameRegistry.registerItem(this);
        setCreativeTab(WallItems.tabWallz);
        setMaxStackSize(1);
	
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4)
    {
    par3List.add("New invention!technology is fast!");
    par3List.add("or i might say...magic!??[Vampire magic?]");
    par3List.add("also gives 25 blocks reach");

    }
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer player)
	{
	player.addPotionEffect(new PotionEffect(Potion.absorption.getId(),1000 ,9));
	player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(),1000 ,9));
	player.addPotionEffect(new PotionEffect(Potion.saturation.getId(), 1000 ,9));
		 return ItemStack;
	}
	
	@Override
	public boolean hitEntity(ItemStack itemstack,EntityLivingBase target, EntityLivingBase player){
	    if(!target.worldObj.isRemote){
	        if(target instanceof Entity){
	            target.motionX = 2.5;
	            target.motionZ = 2.5;
	            target.motionY = 0.2;
	            target.setJumping(true);
	            return true;
	        }
	    }
	    return false;
	}
    @Override
    public float getReach() 
    {
        return 25.0F;
    }
}
