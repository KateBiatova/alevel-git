package com.alevel.patterns.factory;

public class FactoryMethod {
    public static void main(String[] args){
        Creator[] creators = {new CreatorVinyl(), new CreatorForPainting()};
        for (Creator creator: creators){
            System.out.println(creator.glueWallpaper());
            System.out.println();


        }
    }
}
