package zhang.Wallz.proxy;

import zhang.Wallz.blocks.WallzBlocks;
import zhang.Wallz.items.WallItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		WallzBlocks.registerRenders();
		WallItems.RegisterItemRenders();
	}

}
