package com.alevel.bookLibrary;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
