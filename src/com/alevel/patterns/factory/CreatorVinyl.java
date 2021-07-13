package com.alevel.patterns.factory;

public class CreatorVinyl extends Creator{

    @Override
    public VinylWallpaper glueWallpaper() {
        System.out.println("Will be glued vinyl wallpaper");
        return new VinylWallpaper();
    }
}
