import java.util.Scanner;

public class Productofdigits {
     public static int digitproduct(int n) {
        if (n%10== n) {
            return n;
        }
        return n%10 * digitproduct(n / 10);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int ans = digitproduct(n);
        System.out.println("Ans"+" : "+ ans);
    }
    
}
