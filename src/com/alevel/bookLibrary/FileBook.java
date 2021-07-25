package com.alevel.bookLibrary;

public enum FileBook {
    FILE_PATH("src/com/alevel/bookLibrary/fileLibrary.txt");
    private final String path;

    FileBook(String path){
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
