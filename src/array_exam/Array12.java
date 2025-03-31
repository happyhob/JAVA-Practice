package array_exam;

import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        /**
         * array의 일부분을 참조해서 만들 수 있는 방식
         * copyOgRange(arr, startidx, endidx);
         */

        char[] copyFrom = {'a','b','c','d','e'};

//        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 3);
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);

        System.out.println(copyTo);
    }
}
