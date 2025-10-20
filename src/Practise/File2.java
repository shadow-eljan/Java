package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {

        String filePath = "D:\\save\\2nd semester\\non credit\\java\\java.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
