package simwir.matcraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import simwir.matcraft.lib.ItemReferrences;
import simwir.matcraft.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTable extends Item {
	public ItemTable(){
		this.setUnlocalizedName(ItemReferrences.ITEM_TABLE_UNC_NAME);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(References.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
