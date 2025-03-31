package array_exam;

import java.util.Arrays;

//sort 정렬(오름차순)
public class Array14 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }
}
