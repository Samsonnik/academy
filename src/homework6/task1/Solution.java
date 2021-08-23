package homework6.task1;

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static final String OUTPUT_FILE = "src//io//homework6//task1.txt";

    public static void main(String[] args) {

        File outputFile = makeFile(OUTPUT_FILE);
        writeFromConsole(outputFile);
    }

    public static File makeFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return file;
    }

    public static void writeFromConsole(File outputFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter(outputFile)){

             while (true){
                String line = bufferedReader.readLine();
                if (line.equalsIgnoreCase("stop")){
                    break;
                }
                fileWriter.write(line);
             }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
