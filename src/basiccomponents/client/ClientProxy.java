package basiccomponents.client;

import basiccomponents.common.BasicComponents;
import basiccomponents.common.CommonProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{

	}

	@Override
	public void init()
	{
		super.init();
		BasicComponents.registerTileEntityRenderers();
	}
}
