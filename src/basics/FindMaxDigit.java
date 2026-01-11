package basics;

public class FindMaxDigit {
    static void main(String[] args) {
        int[] numbers = {
                42, 7, 89, 13, 56, 3, 77, 24, 91, 18,
                65, 2, 38, 84, 29, 50, 6, 73, 11, 97,
                31, 58, 4, 69, 22, 81, 15, 90, 27, 45,
                9, 63, 1, 86, 34, 71, 19, 95, 52, 8,
                66, 25, 78, 14, 99, 36, 57, 5, 88, 21
        };

        int maxZahl = findeMax(numbers);
        System.out.println(maxZahl);

    }

    static int findeMax(int[] ints){
        int startFirstIndexAsMaxDigit = ints[0];
        for (int index = 0; index < ints.length; index++) {
            if (startFirstIndexAsMaxDigit < ints[index]){
                startFirstIndexAsMaxDigit = ints[index];
            }
        }
        return startFirstIndexAsMaxDigit;
    }
}
