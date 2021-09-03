package homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {

        User user = new User("Ivan", "Ivanov", 21, LocalDate.of(2000, 12, 1), "IvanLogin",
                "IvanPassword", "Ivan@mail.ru");

        try {
            Class<?> userClass = User.class;

            System.out.println(userClass.getMethod("printUserInfo"));

//            Method[] methods = userClass.getMethods();
//            for (Method method: methods){
//                System.out.println(method.getName());
//            }


//            Field userField = userClass.getField("password");
//            System.out.println(userField.getName());


//            Field[] fields = userClass.getFields();
//
//            for (Field field: fields){
//                System.out.println(field.getName());
//            }

            System.out.println(userClass.getDeclaredMethod("getLogin"));

//            Method[] methods = userClass.getDeclaredMethods();
//            for (Method method: methods){
//                System.out.println(method.getName());
//            }

//            Field userField = userClass.getDeclaredField("password");
//            System.out.println(userField.getName());

//            Field[] fields = userClass.getDeclaredFields();
//
//            for (Field field: fields){
//                System.out.println(field.getName());
//            }

            Class<?> userClassObject = user.getClass();
            Field userField = userClassObject.getDeclaredField("login");
            userField.setAccessible(true);
            System.out.println("Before: " + userField.get(user));
            userField.set(user, "newIvanLogin");
            System.out.println("After: " + userField.get(user));

            Class<? extends User> classUser = user.getClass();
            Method toStringMethod = classUser.getDeclaredMethod(user.toString());
            toStringMethod.invoke(user);


        } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e){
            System.out.println(e.getMessage());
        }
    }
}
