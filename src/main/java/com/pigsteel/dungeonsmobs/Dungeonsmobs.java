package com.pigsteel.dungeonsmobs;

import net.fabricmc.api.ModInitializer;

import java.io.Console;

public class Dungeonsmobs implements ModInitializer {
    // To match other minecraft dungeons related mods, this ID is 'mcdm', meaning minecraft dungeons mobs.
    public static String modID = "mcdm";

    @Override
    public void onInitialize() {
        System.out.print("Dungeons mobs!!!");
    }
}
