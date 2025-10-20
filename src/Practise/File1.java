package Practise;

import java.io.FileWriter;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {

        String filePath="D:\\save\\2nd semester\\non credit\\java\\java.txt";
        String text = """
                I love java
                java loves me
                I hate bugs
                Bugs hate me
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(text);
            System.out.println("Successfully Written!");
        }catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
