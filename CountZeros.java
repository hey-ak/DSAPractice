public class CountZeros {
    public static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }
    }
    
    public static int countZeros(int n) {
        return helper( n , 0);
    }

    public static void main(String[] args) {
        int ans = countZeros(132005);
        System.out.println(ans);
        
    }
}