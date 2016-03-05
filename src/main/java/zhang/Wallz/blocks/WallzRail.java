package zhang.Wallz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class WallzRail extends WallzRailBase {

    public static final PropertyEnum<WallzRailBase.EnumRailDirection> SHAPE = PropertyEnum.<WallzRailBase.EnumRailDirection>create("shape", WallzRailBase.EnumRailDirection.class);

    protected WallzRail()
    {
        super(false);
        this.setDefaultState(this.blockState.getBaseState().withProperty(SHAPE, WallzRailBase.EnumRailDirection.NORTH_SOUTH));
    }

    protected void onNeighborChangedInternal(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        if (neighborBlock.canProvidePower() && (new WallzRailBase.Rail(worldIn, pos, state)).countAdjacentRails() == 3)
        {
            this.func_176564_a(worldIn, pos, state, false);
        }
    }

    public IProperty<WallzRailBase.EnumRailDirection> getShapeProperty()
    {
        return SHAPE;
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(SHAPE, WallzRailBase.EnumRailDirection.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((WallzRailBase.EnumRailDirection)state.getValue(SHAPE)).getMetadata();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {SHAPE});
    }
	
}
