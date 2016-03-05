package zhang.Wallz.tileentiy;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class WallzTileEntitys {

    public static void init() {
        GameRegistry.registerTileEntity(WallSafeTileEntity.class, "wall_safe_tile_entity");
    }
	
}

