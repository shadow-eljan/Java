package Recursion;

import java.io.File;

public class searchingFolder {
    public static void listFiles(File folder) {

        // Base case: if not a folder, stop
        if (!folder.isDirectory()) {
            return;
        }

        // Print all items
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());

            // If item is a folder → recursively list inside it
            if (file.isDirectory()) {
                listFiles(file);
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File("D:\\save\\wall");
        listFiles(folder);
    }
}
