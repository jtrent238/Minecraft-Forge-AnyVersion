package com.jtrent238.mcforgeav;

import net.fybertech.meddle.MeddleMod;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.init.Blocks;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;

@Mod(modid=Main.MODID/*, name=Main.MODNAME*/, version=(Main.MODVERSION))
@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class Main
{
	
    public static final String MODID = "mcforgeav";
    public static final String MODVERSION = "pre-1.0.0.0";
	public static final String APIVERSION = "NA";
	public static final String MODNAME = "jtrent238's Minecraft Forge AnyVersion Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = SupportedMCVersions.getVersion();
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) throws IOException
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//proxy.init(event);
		
		class MaxMemory {
		    {
		        Runtime rt = Runtime.getRuntime();
		        long totalMem = rt.totalMemory();
		        long maxMem = rt.maxMemory();
		        long freeMem = rt.freeMemory();
		        double megs = 1048576.0;

		        System.out.println ("Total Memory: " + totalMem + " (" + (totalMem/megs) + " MiB)");
		        System.out.println ("Max Memory:   " + maxMem + " (" + (maxMem/megs) + " MiB)");
		        System.out.println ("Free Memory:  " + freeMem + " (" + (freeMem/megs) + " MiB)");
		    }
		   }
		
		//Print Debug Information!
		System.out.println("Minecraft Version: " + Main.MC);
		System.out.println("Mod Name: " + Main.MODNAME);
		System.out.println("Mod ID: " + Main.MODID);
		System.out.println("Mod Version: " + Main.MODVERSION);
		System.out.println("Mod Author: " + Main.MODAUTHOR);
		System.out.println("API Version: " + Main.APIVERSION);
		
		
		}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {
		
		Thread.currentThread().setName(Main.MODNAME);
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		{

		}
		
		
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		//Thread.currentThread().setName("EpicProportionsMod");
	     MinecraftServer server = MinecraftServer.getServer();
	     // Get's the current server instance
	     
	     ICommandManager command = server.getCommandManager();
	     ServerCommandManager manager = (ServerCommandManager) command;
	     

	}

	public void acceptOptions(List<String> arg0, File arg1, File arg2, String arg3) {
		
	}

	public String[] getLaunchArguments() {
		return null;
	}

	public String getLaunchTarget() {
		return null;
	}

	public void injectIntoClassLoader(LaunchClassLoader arg0) {
		
	}
	
	
}
