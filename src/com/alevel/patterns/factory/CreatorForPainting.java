package com.alevel.patterns.factory;

public class CreatorForPainting extends Creator{
    @Override
    public ForPaintingWallpaper glueWallpaper() {
        System.out.println("Will be glued wallpaper for painting");
        return new ForPaintingWallpaper();
    }
}
