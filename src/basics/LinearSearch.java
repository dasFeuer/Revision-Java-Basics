package basics;

public class LinearSearch {
    static void main(String[] args) {
        int[] numbers = {
                42, 7, 89, 13, 56, 3, 77, 24, 91, 18,
                65, 2, 38, 84, 29, 50, 6, 73, 11, 97,
                31, 58, 4, 69, 22, 81, 15, 90, 27, 45,
                9, 63, 1, 86, 34, 71, 19, 95, 52, 8,
                66, 25, 78, 14, 99, 36, 57, 5, 88, 21
        };

        int target = 21;

        int index = linearSearchFindIndex(numbers, target);
        System.out.println(index);

        int element = linearSearchFindElement(numbers, target);
        System.out.println(element);
    }
    static int linearSearchFindElement(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target){
                return element;
            }
        }
        return -1;
    }


    static int linearSearchFindIndex(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
