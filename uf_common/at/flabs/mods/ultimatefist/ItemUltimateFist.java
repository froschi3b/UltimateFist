package at.flabs.mods.ultimatefist;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemUltimateFist extends ItemTool {
    
    protected ItemUltimateFist(int par1) {
        super(par1, 9, EnumToolMaterial.EMERALD, null);
        this.maxStackSize = 1;
        this.setMaxDamage((int) (EnumToolMaterial.EMERALD.getMaxUses() * 2.5));
        this.efficiencyOnProperMaterial = 400.0F;
        this.damageVsEntity = 19F;
        this.setCreativeTab(CreativeTabs.tabTools);
        this.func_111206_d(Vars.sprite);
    }
    
    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
    
    @Override
    public int getItemEnchantability() {
        return 30;
    }
    
    @Override
    public float getStrVsBlock(ItemStack stack, Block block, int meta) {
        return efficiencyOnProperMaterial;
    }
    
    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
        return efficiencyOnProperMaterial;
    }
    
    @Override
    public boolean canHarvestBlock(Block par1Block) {
        return true;
    }
}
