package at.flabs.mods.ultimatefist;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Vars.modid, name = Vars.name, version = Vars.version)
@NetworkMod
public class UltimateFist {
    
    public static ItemUltimateFist fist;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent evt){
        Configuration config = new Configuration(new File(evt.getModConfigurationDirectory(), "PhazonMod.cfg"));
        int id=config.getItem("UltimateFist", 23432).getInt();
        fist=new ItemUltimateFist(id);
        fist.setUnlocalizedName(Vars.fistName);
        GameRegistry.addRecipe(new ItemStack(fist), "DDD","LLD","DDD",'D',Item.diamond,'L',Item.leather);
        LanguageRegistry.instance().addNameForObject(fist, "en_US", "Ultimate Fist");
    }
}
