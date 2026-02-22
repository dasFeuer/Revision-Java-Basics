package Recursion;

public class Fibo{
    static void main(String[] args) {
        int answer = number(4);
        System.out.println(answer);
    }
    static int number(int n){
        if (n < 2) {
            return n;
        }

        return number(n - 1) + number(n - 2);
    }
}
