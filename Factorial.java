public class Factorial {
    public static long fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        long ans = fact(10);
       System.out.println(ans); 
    }
    
}
