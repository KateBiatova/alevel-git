package com.alevel.collectionsHW;

import java.io.File;
import java.io.IOException;

public class CrudFile {
    public void createFile(String path){
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
