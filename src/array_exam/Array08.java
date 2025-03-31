package array_exam;
// 이차원 배열
public class Array08 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("array[%d][%d] = %d\n", i, j, array[i][j]);
            }
        }
    }
}
