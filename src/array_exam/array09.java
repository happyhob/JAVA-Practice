package array_exam;
// 2차원 배열과 초기
public class array09 {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[2];
        array[1] = new int[3];

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("array[%d][%d] = %d\n", i, j, array[i][j]);
            }
            System.out.println();
        }

    }

}
