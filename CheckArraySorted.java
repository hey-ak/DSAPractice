public class CheckArraySorted {

    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 9, 25, 51, 110 };
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
    
}
