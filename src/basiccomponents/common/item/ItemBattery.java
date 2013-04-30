package basiccomponents.common.item;

import basiccomponents.common.BasicComponents;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import universalelectricity.core.item.ItemElectric;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBattery extends ItemElectric
{
	public ItemBattery(int id)
	{
		super(id);
		this.setUnlocalizedName("battery");
		this.setCreativeTab(BasicComponents.TAB);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().replace("item.", BasicComponents.TEXTURE_NAME_PREFIX));
	}

	@Override
	public double getMaxJoules(ItemStack itemStack)
	{
		return 1000000;
	}

	@Override
	public double getVoltage(ItemStack itemStack)
	{
		return 25;
	}
}
