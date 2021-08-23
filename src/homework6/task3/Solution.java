package homework6.task3;

import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        ArrayList<User> userList = generateUserList(10);
        createAndSerialFiles(userList);
    }

    public static ArrayList<User> generateUserList(int userNumber){

        ArrayList<User> arrayList = new ArrayList<>();
        for (int i = 1; i <= userNumber ; i++) {
            arrayList.add(new User("Jack" + i, "Jackson" + i, 20 + i));
        }
        return arrayList;
    }

    public static void createAndSerialFiles(ArrayList<User> arrayList){

        String path = "src//io//homework6//users//";
        String fileFormat = ".txt";

        String dirPath = "src//io//homework6//users";
        File dir = new File(dirPath);

        if (!dir.exists()) {
            dir.mkdir();
        }

        for (User user : arrayList) {
            String finalPath = path + user.getFirstName() + user.getLastName() + fileFormat;
            File file = new File(finalPath);

            serializeUser(user, file);

            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void serializeUser(User user, File outputFile){

        try(FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(user);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

// training

//    public static User deSerialUser(File inputFile){
//
//        User user = new User();
//
//        try(FileInputStream fileInputStream = new FileInputStream(inputFile);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
//            user = (User) objectInputStream.readObject();
//        } catch (IOException | ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//        return user;
//    }

}
