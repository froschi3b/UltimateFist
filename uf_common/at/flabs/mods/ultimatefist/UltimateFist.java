package at.flabs.mods.ultimatefist;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Vars.modid, name = Vars.name, version = Vars.version)
@NetworkMod
public class UltimateFist {
    
    public static ItemUltimateFist fist;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent evt){
        Configuration config = new Configuration(new File(evt.getModConfigurationDirectory(), "PhazonMod.cfg"));
        int id=config.getItem("UltimateFist", 23432).getInt();
        fist=new ItemUltimateFist(id);
    }
}
