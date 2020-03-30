package Lesson_1;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        Integer[] array1 = {1, 2 , 3, 4 , 5};
        printArray(array1);
        replace(array1, 2, 4);
        printArray(array1);

        System.out.println("Задача 2");
        String[] array2 = {"1", "2","3","4","5"};
        ArrayList<String> list = arrayToArrayList(array2);
        printList(list);

    }

    public static <T> void replace(T[] array, int index1, int index2){
        if((index1 >= 0 && index1 < array.length) && (index2 >= 0 && index2 < array.length)){
            T buffer = array[index1];
            array[index1] = array[index2];
            array[index2] = buffer;
        }
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array){
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static <T> void printArray(T[] array){
        for (T t : array) System.out.print(t + " ");
        System.out.println();
    }

    public static <T> void printList(ArrayList<T> array){
        for (T t : array) System.out.print(t + " ");
        System.out.println();
    }

}
