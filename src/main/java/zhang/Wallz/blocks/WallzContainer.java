package zhang.Wallz.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import zhang.Wallz.items.WallItems;
import zhang.Wallz.tileentiy.WallSafeTileEntity;

public class WallzContainer extends BlockContainer {
	
	public WallzContainer() {
		super(Material.iron);
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("wallsafe");
        this.setHardness(0.5F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeWood);
        this.isBlockContainer = true;
	}

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new WallSafeTileEntity();
    }
    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
        WallSafeTileEntity te = (WallSafeTileEntity) world.getTileEntity(pos);
        InventoryHelper.dropInventoryItems(world, pos, te);
        super.breakBlock(world, pos, blockstate);
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (stack.hasDisplayName()) {
            ((WallSafeTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
        }
    }
	@Override
	public int getRenderType() {
		return 3;
	}
    
}
	
	


