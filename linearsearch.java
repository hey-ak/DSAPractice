public class linearsearch{
    public static int linearsearch(int arr[], int target, int index){
        if(arr[index]==target){
            return index;
        }
        else{
            return linearsearch(arr, target, index + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 9, 8, 7, 45 };
        int ans = linearsearch(arr, 8, 0);
        System.out.println(ans);

        
    }
}