package arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {3, 6, 7, 9, 2},
                {4, 2, 6},
                {9, 20, 5, 23}
        };

        System.out.println(matrix[1][1]);
        System.out.println("----");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("Element in position %d%d is %d\n", i, j, matrix[i][j]);
            }
        }
    }
}
