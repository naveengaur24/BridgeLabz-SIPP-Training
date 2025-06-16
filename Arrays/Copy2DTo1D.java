import java.util.*;

class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter elements of the matrix");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[idx++] = mat[i][j];
            }
        }
        System.out.println("1D arr");
        for (int i : arr){
            System.out.print(i +" ");
        }
    }
}