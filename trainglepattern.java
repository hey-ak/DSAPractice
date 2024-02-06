public class trainglepattern {
    public static void tp(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            tp(r, c + 1);
        }
        else {
            System.out.println();
            tp(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        tp(4, 0);
    }

}
