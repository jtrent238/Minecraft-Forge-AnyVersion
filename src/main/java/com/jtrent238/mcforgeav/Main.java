package com.jtrent238.mcforgeav;

import net.fybertech.meddle.MeddleMod;
import net.minecraft.init.Blocks;

import java.util.ArrayList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid="gg"/*, name="gg"*/, version=(Main.MODVERSION))
@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class Main
{
	
    public static final String MODID = "mcforgeav";
    public static final String MODVERSION = "pre-1.0.0.0";
	public static final String APIVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's Minecraft Forge AnyVersion Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = SupportedMCVersions.getVersion();
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
