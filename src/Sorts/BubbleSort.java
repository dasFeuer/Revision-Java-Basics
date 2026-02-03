package Sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] zahlen = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(zahlen);
        System.out.println(Arrays.toString(zahlen));
    }

    static void bubbleSort(int[] array) {
        boolean isSwapped;

        for (int i = 0; i < array.length; i++) {

            isSwapped = false;

            for (int j = 1; j < array.length - i; j++) {
                if(array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
}
