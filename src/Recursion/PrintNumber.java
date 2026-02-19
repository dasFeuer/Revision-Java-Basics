package Recursion;

public class PrintNumber {
    static void main(String[] args) {
        String[] arr = {"2", "a", "8", "e"};
        print(1);
    }

    static void print(int num){
        if (num == 10){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print(num + 1);
    }
}
