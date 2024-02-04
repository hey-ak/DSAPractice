import java.util.Scanner;

public class SumofDigits {
    public static int digitsum(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + digitsum(n / 10);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = digitsum(n);
        System.out.println("Ans"+" : "+ ans);
    }
}