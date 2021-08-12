package homework5.task4;

import java.util.*;

public class StudentsList {

    private final Random random = new Random();
    private ArrayList<Integer> studentsList = new ArrayList<>();
    private int size = 0;

    public StudentsList(int size) {
        this.size = size;
    }

    public void fillList(){
        for (int i = 0; i < size; i++) {
            studentsList.add(random.nextInt(11));
        }
    }

    public int getMaxMark() {

        int maxMark = studentsList.get(0);
        Iterator<Integer> iterator = studentsList.iterator();
        while (iterator.hasNext()){
            int temp = iterator.next();
            if (maxMark < temp){
                maxMark = temp;
            }
        }
        return maxMark;
    }

    public void printList(){
        System.out.println(Arrays.toString(studentsList.toArray()));
    }
}
