package lenaBunko.tasks;

import java.util.Arrays;

public class MyMainClass {
    public static void main(String[] args) {
        System.out.println("Solving the task \"MergingSortedArrays\"");
        System.out.println(Arrays.toString(MergingSortedArrays.mergeArr(new int[]{1, 4}, new int[]{1, 2, 4, 6, 7})));
        System.out.println(Arrays.toString(MergingSortedArrays.mergeArr(new int[]{5, 6}, new int[]{3, 4})));
        System.out.println(Arrays.toString(MergingSortedArrays.mergeArr(new int[]{}, new int[]{3, 4})));
        System.out.println(Arrays.toString(MergingSortedArrays.mergeArr(new int[]{}, new int[]{})));
    }
}
