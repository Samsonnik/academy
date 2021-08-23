package homework6.task2;

import java.io.*;

public class Solution {

    public static final String TEXT = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
            "took a galley of type and scrambled it to make a type specimen book. It has survived not only five c " +
            "enturies, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
            "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and " +
            "more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";


    public static final String FILE1_PATH = "src//io//homework6//file.txt";
    public static final String RESULT_PATH = "src//io//homework6//result.txt";

    public static void main(String[] args) {

        File fileDemo = makeFile(FILE1_PATH);
        writeTextFromString(TEXT, fileDemo);
        File result = makeFile(RESULT_PATH);
        changeAndWrite(fileDemo, result);

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

    public static void writeTextFromString(String text, File file) {
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void changeAndWrite(File file1, File file2){
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)){

            int a;
            while ((a = fileInputStream.read()) != -1){
                if(a == ' '){
                    continue;
                }
                fileOutputStream.write(a);
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
