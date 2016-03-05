package zhang.Wallz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zhang.Wallz.items.WallItems;

public class s4leaguefloor1 extends Block {

	public s4leaguefloor1(Material material) {
		super(material);
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("s4leaguefloor1");
        this.setHardness(0.5F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeMetal);
	  }
	
}
