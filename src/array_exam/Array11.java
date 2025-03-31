package array_exam;
// Arrays    ,  java.utill.Arrays.copyOf()
public class Array11 {
    public static void main(String[] args) {
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        // ==비교는 같은 걸 참조하는지 여부를 조회한다.
        if(copyFrom == copyTo){
            System.out.println("copyFrom == copyTo");
        }else{
            System.out.println("copyFrom != copyTo");
        }

        for(int c: copyTo){
            System.out.printf("c = %d\n", c);
        }
        System.out.println("--------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);

        for(int c: copyTo2){
            System.out.printf("c = %d\n", c);
        }


        /* 같은 걸 참조하는가?
        * */
        int[] exampleArr = {1,2,3};
        int[] exampleArr2 = exampleArr;
        System.out.println("------------"+exampleArr2); // exampleArr의 참조하는 것을 같이 참조하는 것이고

        int[] exampleArr3 = java.util.Arrays.copyOf(exampleArr, 5); // 새로운 객체를 생성해서 그 객체를 가리킴





    }
}
