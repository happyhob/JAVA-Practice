package array_exam;

import java.util.Arrays;

// 배열 비교(compare)
public class Array13 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 4, 5};

        // 양수, 0, 음수
        // x-y =result
        // 원소의 개수가 많거나, 원소의 값이 큰 것을 큰 배열로 볼 수 있다.
        int compare = Arrays.compare(arr1, arr2);
        System.out.println(compare); //같으면 0 , 왼쪽 배열이 크면 양수, 오른쪽 배열이 크면 음수가 나옴


    }
}
