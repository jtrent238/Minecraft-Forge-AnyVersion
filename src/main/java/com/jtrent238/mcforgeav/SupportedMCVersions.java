package com.jtrent238.mcforgeav;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class SupportedMCVersions {
	
	public static String aa = "1.7.10";
	public static String ab = "1.8";
	private static String version;
	
	
	public static String getVersion() {
		return SupportedMCVersions.checkVersion();
	}

	public static String checkVersion() {
		if(MinecraftForge.MC_VERSION == aa){
			version = aa;
		}
		else
			versionNS();
		if(MinecraftForge.MC_VERSION == ab){
			version = ab;
		}
		else
			versionNS();
		return version;
	}

	private static void versionNS() {
		System.out.println("Version Not Supported!!!");
	}
}
