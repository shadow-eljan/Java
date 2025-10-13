package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class usingFileReader {
    public static void main(String[] args) {

        //BufferedReader + FIleReader = Best for reading files line by line
        // FileInputStream = Best for binary files (Eg; images)
        //RandomAccessFile = Best for read/write specific portion of a large file

        String filePath = "D:\\save\\2nd semester\\non credit\\java\\java.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file.");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
