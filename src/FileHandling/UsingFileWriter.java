package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) {

        //FileWriter = Good for small or medium-sized text file
        // BufferedWriter = Better performance for large amount of text
        //PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (eg: images, audio)


        String filePath = "D:\\save\\2nd semester\\non credit\\java\\java.txt";
        String textContent = "I like to eat Momo.\nIts very tasty.";
        String multiLineText =  """
                Roses are Red
                Violet are Blue
                Oh my momo
                I want to eat you.
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(multiLineText);
            System.out.println("File has been written successfully.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        catch(IOException e){
            System.out.println("Error Writing the file.");
        }
    }
}
