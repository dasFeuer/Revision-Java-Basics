package Recursion;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 44, 55, 76, 81, 95, 100};
        int target = 55;

        int answer = search(arr, target, 0, arr.length - 1);
        System.out.println(answer);
    }

    static int search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }

        if (target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
