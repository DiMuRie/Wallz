package zhang.Wallz.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zhang.Wallz.items.WallItems;

public class clay_wall extends BlockPane {
	
	
	public clay_wall(Material material) {
		super(material, false);
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("clay_wall");
        this.setHardness(0.5F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeMetal);
	  }

	  // used by the renderer to control lighting and visibility of other blocks.
	  // set to false because this block doesn't fill the entire 1x1x1 space
	  @Override
	  public boolean isOpaqueCube() {
	    return false;
	  }

	  // used by the renderer to control lighting and visibility of other blocks, also by
	  // (eg) wall or fence to control whether the fence joins itself to this block
	  // set to false because this block doesn't fill the entire 1x1x1 space
	  @Override
	  public boolean isFullCube() {
	    return false;
	  }
}




