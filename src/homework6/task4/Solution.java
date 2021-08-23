package homework6.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Solution {

    public static final String TEXT = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
            "took a galley of type and scrambled it to make a type specimen book. It has survived not only five c " +
            "enturies, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
            "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and " +
            "more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

    public static final String DIR_PATH = "src//io//homework6//task4";
    public static final String FILES_PATH = "src//io//homework6//task4//file";
    public static final String RESULT_PATH = "src//io//homework6//task4//result.txt";


    public static void main(String[] args) {

        int filesNumber = 100;

        makeDirAndFiles(filesNumber);
        ArrayList<File> listOfFiles = makeListOfFiles(filesNumber);
        writeTextFromListOfFiles(listOfFiles, TEXT);
        makeResultFile(listOfFiles);


    }

    public static void makeDirAndFiles(int filesNumber) {

        File dir = new File(DIR_PATH);

        if (!dir.exists()) {
            dir.mkdir();
        }

        for (int i = 1; i <= filesNumber; i++) {

            String filesFormat = ".txt";
            String filesPath = FILES_PATH + i + filesFormat;
            File file = new File(filesPath);

            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static ArrayList<File> makeListOfFiles(int filesNumber) {

        ArrayList<File> listOfFiles = new ArrayList<>();
        for (int i = 1; i <= filesNumber; i++) {
            String filesFormat = ".txt";
            String filesPath = FILES_PATH + i + filesFormat;
            File file = new File(filesPath);
            listOfFiles.add(file);
        }
        return listOfFiles;
    }

    public static void writeTextFromListOfFiles(ArrayList<File> listOfFiles, String text) {

        for (File file: listOfFiles) {
            try (FileWriter fileWriter = new FileWriter(file)) {
                int randomInt = (int) (Math.random() * (text.length() + 1)); //    [0; text.length + 1)
                fileWriter.write(text.substring(0, randomInt));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void makeResultFile(ArrayList<File> listOfFiles){

        File result = new File(RESULT_PATH);

        if (!result.exists()){
            try {
                result.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        double size;

        try (FileWriter fileWriter = new FileWriter(result)){
            for (File file: listOfFiles){

                size = (double) file.length() / 1024;
                fileWriter.write("File name: " + file.getName() + ". ");
                fileWriter.write("File size: " + size + " kb. ");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
