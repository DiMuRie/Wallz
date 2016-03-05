package zhang.Wallz.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import zhang.Wallz.items.WallItems;

public class rbridge extends WallzRail{
	
	public rbridge(Material material) {
		super();
        this.setCreativeTab(WallItems.tabWallz);
        this.setUnlocalizedName("rbridge");
        this.setHardness(0.5F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeWood);
	}
	@Override
    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity) {
       if (state != null && state.getValue(SHAPE) != null)
            if (state.getValue(SHAPE) == EnumRailDirection.ASCENDING_EAST) { // Depending on which side the block is facing
                setBlockBounds(0.125F, 0.125F, 0F, 0.1875F, 0.1875F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.5F, 0.5F, 0F, 1F, 1F, 1F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.875F, 0.875F, 0.125F, 0.6875F, 0.625F, 0.5625F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
               // setBlockBounds(0.125F, 0F, 0F, 0.1875F, 2F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.8125F, 0F, 0F, 0.875F, 2F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.ASCENDING_NORTH) {
                setBlockBounds(0F, 0.0875F, 0F, 1F, 1F, 0.125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0F, 0.5F, 0.5F, 1F, 0.625F, 0.625F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.125F, 0F, 0.875F, 1F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.125F, 1F, 2F, 0.1875F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.8125F, 1F, 2F, 0.875F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.ASCENDING_SOUTH) {
                setBlockBounds(0F, 0.125F, 0F, 1F, 0.25F, 0.125F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0F, 0F, 0.5F, 1F, 0.625F, 0.625F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.125F, 0.875F, 0.875F, 1F, 1F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.125F, 1F, 2F, 0.1875F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.8125F, 1F, 2F, 0.875F);
               // super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.ASCENDING_WEST) {
                setBlockBounds(0F, 0.875F, 0F, 0.125F, 1F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.5F, 0.5F, 0F, 0.625F, 0.625F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.875F, 0.125F, 0F, 1.0F, 0.25F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.125F, 0F, 0F, 0.1875F, 2F, 1F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.8125F, 0F, 0F, 0.875F, 2F, 1F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.EAST_WEST) {
                setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.125F, 0F, 0F, 0.1875F, 0.75F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.8125F, 0F, 0F, 0.875F, 0.75F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.NORTH_EAST) {
            	setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.125F, 0F, 0.0625F, 1F, 0.75F, 0.125F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.0625F, 0F, 0.0625F, 0.175F, 0.75F, 1F);
               // super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.NORTH_SOUTH) {
            	setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.125F, 0F, 0F, 0.1875F, 0.75F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                setBlockBounds(0.8125F, 0F, 0F, 0.875F, 0.75F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.NORTH_WEST) {
            	setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.875F, 0.875F, 0.75F, 0.9375F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.875F, 0F, 0F, 0.9275F, 0.75F, 0.9275F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);          
            } else if (state.getValue(SHAPE) == EnumRailDirection.SOUTH_EAST) {
            	setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.125F, 0F, 0.0625F, 1F, 0.75F, 0.125F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0.0625F, 0F, 0.0625F, 0.125F, 0.75F, 1F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            } else if (state.getValue(SHAPE) == EnumRailDirection.SOUTH_WEST) {
            	setBlockBounds(0F, 0F, 0F, 1.0F, 0.125F, 1F);
                super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
                //setBlockBounds(0F, 0F, 0.0625F, 0.875F, 0.75F, 0.125F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
               // setBlockBounds(0.875F, 0F, 0.0625F, 0.9275F, 0.75F, 1F);
                //super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
            }
	}
}

