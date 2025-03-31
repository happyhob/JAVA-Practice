package array_exam;

public class Array10 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //기본 반복문
        for(int i=0; i<array.length; i++){
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }

        //foreach 반복문
        for(int i: array){
            System.out.printf("i = %d\n", i);
        }

    }
}
