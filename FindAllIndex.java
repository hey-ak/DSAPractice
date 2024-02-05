import java.util.*;
public class FindAllIndex {
    public static ArrayList<Integer> findAllIndex(int arr[], int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;

        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 22, 33, 66, 5, 8, 9, 7, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 5, 0, list));
    }

}
