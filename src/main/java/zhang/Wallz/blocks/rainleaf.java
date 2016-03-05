package zhang.Wallz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zhang.Wallz.items.WallItems;

public class rainleaf extends Block {

	public rainleaf(Material material) {
		super(material);
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("rainleaf");
        this.setHardness(0.5F);
        this.setResistance(600.0F);
        this.setStepSound(soundTypeGrass);
	}
	public boolean isOpaqueCube()
    {
        return false;
    }

	  @SideOnly(Side.CLIENT)
	    public EnumWorldBlockLayer getBlockLayer()
	    {
	        return EnumWorldBlockLayer.CUTOUT;//reminder that i can use TRANSLUCENT too
	    }

}

