package homework5.task4;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList(20);
        studentsList.fillList();
        studentsList.printList();
        System.out.println(studentsList.getMaxMark());
    }
}

