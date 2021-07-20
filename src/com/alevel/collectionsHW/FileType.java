package com.alevel.collectionsHW;

public enum FileType {
   FILE_PATH("file.txt");
   private final String path;

   FileType(String path){
       this.path = path;
   }

   public String getPath() {
       return path;
   }

}
