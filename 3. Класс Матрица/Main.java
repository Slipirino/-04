public class Main {
    public static void main(String[] args) {
        double ar1[][] = {{7, 8, 6}, {4, 3, 7}, {1, 6, 3}};
        double ar2[][] = {{3, 3, 7}, {4, 1, 3}, {7, 5, 2}};
        int ar5 = 2;

        double[][] arAdd = Матрица.matrix_add(ar1, ar2);
        Матрица.print2DArray(arAdd);
        System.out.println("Сложение матриц");
        System.out.println();
        double[][] arMulti = Матрица.matrix_multi(ar1, ar2);
        Матрица.print2DArray(arMulti);
        System.out.println("Умножение матриц матриц");
        System.out.println();
        double[][] arMultiNum = Матрица.matrix_multi_num(ar1, ar5);
        Матрица.print2DArray(arMultiNum);
        System.out.println("Умножение матрицы матрицы на число");

    }
}
