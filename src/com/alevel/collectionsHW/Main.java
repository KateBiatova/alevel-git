package com.alevel.collectionsHW;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new CrudFile().createFile(FileType.FILE_PATH.getPath());

    Scanner console = new Scanner(System.in);
        System.out.println("Enter the count, and press Enter: ");
    int count = console.nextInt();
        System.out.println("Enter the iterations and press Enter: ");
    int iter = console.nextInt();

        PrintWriter outputfile = new PrintWriter(FileType.FILE_PATH.getPath());

        outputfile.println("Entered count: " + count);
        outputfile.println("Entered iter: " + iter);

        for(int i = 0; i < iter; i++) {
            AllCollections.makeArrayList(count, iter, outputfile);
            }
        outputfile.close();
        }
}
