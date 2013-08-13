package at.flabs.mods.ultimatefist;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemUltimateFist extends ItemTool {
    
    protected ItemUltimateFist(int par1)
    {
        super(par1, 9, EnumToolMaterial.EMERALD, Block.blocksList);
        this.maxStackSize = 1;
        this.setMaxDamage((int) (EnumToolMaterial.EMERALD.getMaxUses()*2.5));
        this.efficiencyOnProperMaterial = 400.0F;
        this.damageVsEntity = 19F;
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 30;
    }

    /** FORGE: Overridden to allow custom tool effectiveness */
    @Override
    public float getStrVsBlock(ItemStack stack, Block block, int meta) 
    {
        return efficiencyOnProperMaterial;
    }
}
