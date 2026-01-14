package basics;

public class MaxWealth {
    static void main(String[] args) {
        int[][] accounts = {
                {3, 7, 9},
                {9, 5, 1},
                {9, 8, 3}
        };
        int answer = findMaxWealthOfThePerson(accounts);
        System.out.println(answer);
    }
    static int findMaxWealthOfThePerson(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > answer){
                answer = sum;
            }
        }
        return answer;
    }
}
