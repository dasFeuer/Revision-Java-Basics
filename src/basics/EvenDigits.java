package basics;

public class EvenDigits {
    static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
        int answer = evenDidits(nums);

        System.out.println(answer);
        System.out.println(digitsCount(0));
    }

    static int evenDidits(int[] nums){
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if(even(nums[index])){
                count++;
            }
        }
        return count;
    }

     static boolean even(int nums) {
        int numberOfDigits = digitsCount(nums);
         return numberOfDigits % 2 == 0;
    }

    static int digitsCount(int nums){
        if (nums < 0){
            return nums  * -1;
        }

        if (nums == 0){
            return 1;
        }
       int count = 0;
        while (nums > 0){
            count++;
            nums /= 10;
        }

        return count;
    }
}
