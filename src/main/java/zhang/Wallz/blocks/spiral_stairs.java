package zhang.Wallz.blocks;



import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zhang.Wallz.items.WallItems;

public class spiral_stairs extends Block {
	
	
	
    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    
	
	public spiral_stairs(Material material) {
		super(material);
		this.setUnlocalizedName("spiral_stairs");
        this.setCreativeTab(WallItems.tabWallz);
        this.setHardness(0.2F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        
	}




    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return true;
    }
	public boolean renderAsNormalBlock()
	{
    return false;
	}
	@Override
    public boolean isOpaqueCube()
	{
    return false;
	}
	  @Override
	  public boolean isFullCube() {
	    return false;
	  }
    boolean isNormalBlock(){
    	return false;
    }
	@Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        world.setBlockState(pos, state.withProperty(FACING, getFacingFromEntity(pos, placer)), 2);
    }

    public static EnumFacing getFacingFromEntity(BlockPos clickedBlock, EntityLivingBase entity) {
        return EnumFacing.getFacingFromVector(
             (float) (entity.posX - clickedBlock.getX()),
             (float) (entity.posY - clickedBlock.getY()),
             (float) (entity.posZ - clickedBlock.getZ()));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getIndex();
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, FACING);
    }

    @Override
    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity) {
       if (state != null && state.getValue(FACING) != null)
            if (state.getValue(FACING) == EnumFacing.NORTH) { // Depending on which side the block is facing
                setBlockBounds(0.125F, 0.8125F, 0F, 0.1875F, 0.875F, 0.875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.1875F, 0.8125F, 0F, 0.4375F, 0.875F, 0.4375F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.1875F, 0.5625F, 0.125F, 0.6875F, 0.625F, 0.5625F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.1875F, 0.3125F, 0.625F, 1.0F, 0.375F, 0.8125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.125F, 0.0625F, 0.875F, 1.0F, 0.125F, 1.0F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(FACING) == EnumFacing.SOUTH) {
                setBlockBounds(0.125F, 0.0625F, 0F, 1.0F, 0.125F, 0.125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.25F, 0.3125F, 0.1875F, 1.0F, 0.375F, 0.3125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.1875F, 0.5625F, 0.3125F, 0.6875F, 0.625F, 0.6875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.0625F, 0.8125F, 0.3125F, 0.3125F, 0.875F, 0.875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if(state.getValue(FACING) == EnumFacing.EAST) {
                setBlockBounds(0F, 0.0625F, 0F, 0.125F, 0.125F, 0.875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.1875F, 0.3125F, 0.125F, 0.375F, 0.375F, 0.6875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.3125F, 0.5625F, 0.3125F, 0.625F, 0.625F, 0.6875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.25F, 0.8125F, 0.6875F, 0.875F, 0.875F, 0.875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(FACING) == EnumFacing.WEST) {
                setBlockBounds(0.875F, 0.0625F, 0.125F, 1F, 0.125F, 1.0F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.5F, 0.3125F, 0.375F, 0.75F, 0.375F, 1.0F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.3125F, 0.5625F, 0.3125F, 0.625F, 0.625F, 0.6875F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.0625F, 0.8125F, 0.125F, 0.6875F, 0.875F, 0.3125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
    
}
	


	
