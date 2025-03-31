package array_exam;

//binarySearch

import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        Arrays.sort(arr);

        //binarySearch
        //어느 값과 값의 중간 지점을 찾아서 계쏙해서 비교해 나아가는 방식(약간 스무고개 게임 느낌)
        // -binarySearch를 하기 위해서는 배열이 반드시 정렬돼 있어야 한다.

        System.out.println(Arrays.binarySearch(arr, 1));
    }
}
