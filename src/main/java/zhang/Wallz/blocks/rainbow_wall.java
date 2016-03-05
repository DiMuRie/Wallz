package zhang.Wallz.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import zhang.Wallz.items.WallItems;

public class rainbow_wall extends BlockPane {
	
	
	public rainbow_wall(Material material) {
		super(material, false);
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("rainbow_wall");
        this.setHardness(0.5F);
        this.setResistance(60.0F);
        this.setStepSound(soundTypeMetal);
	  }

}




