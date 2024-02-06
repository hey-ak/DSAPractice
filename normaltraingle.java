public class normaltraingle {
    public static void nt(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            nt(r, c + 1);
            System.out.print("*");
        }
        else {
            nt(r - 1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nt(4, 0);
    }
    
}
