package basics;

public class SearchInRange {
    static void main(String[] args) {
        int[] numbers = {
                42, 7, 89, 13, 56, 3, 77, 24, 91, 18,
                65, 2, 38, 84, 29, 50, 6, 73, 11, 97,
                31, 58, 4, 69, 22, 81, 15, 90, 27, 45,
                9, 63, 1, 86, 34, 71, 19, 95, 52, 8,
                66, 25, 78, 14, 99, 36, 57, 5, 88, 21
        };

        int target = 7;

        int indexInRange = findArrayInRange(numbers, target, 1, 10);

        System.out.println(indexInRange);
    }

    static int findArrayInRange(int[] num, int target, int start, int end){
        if(num.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = num[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
