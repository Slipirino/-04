public class Матрица {
    public static double[][] matrix_add(double[][] ar1, double[][] ar2) {
        double[][] ar4 = new  double[ar1.length][ar1[0].length];
        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar1[0].length;j++){
                ar4[i][j] = ar1[i][j] + ar2[i][j];
            }
        }

        return ar4;
    }


    public static double[][] matrix_multi(double[][] ar1, double[][] ar2) {
        int i, j, k;
        int row1 = ar1.length;
        int col1 = ar1[0].length;
        int row2 = ar2.length;
        int col2 = ar2[0].length;
        double[][] ar3 = new double[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < col1; k++) {
                    ar3[i][j] += ar1[i][k] * ar2[k][j];
                }
            }
        }

        return ar3;
    }
    public static double[][] matrix_multi_num(double[][] ar1, double ar5) {
        int i, j, k;
        int row1 = ar1.length;
        int col1 = ar1[0].length;
        int row2 = (int) ar5;
        int col2 = (int) ar5;
        double[][] ar6 = new double[row1][col1];
        for( i=0; i < row1; i++){
            for( j=0; j < col2; j++){
                    ar6[i][j] += ar1[i][j] * ar5;

            }
        }
        return ar6;
    }

    public static void print2DArray(double[][] ar)
    {
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
