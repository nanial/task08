package by.training.task08.service;

import by.training.task08.bean.Matrix;

public class MatrixOperationImpl implements MatrixOperation {
    @Override
    public int[][] multiply(int[][] p, int[][] q) {
        int n = 0, l = 0;
        /*
        Matrix r = new Matrix(n, l);

        for (int i = 0; i < p.a.length; i++) {
            for (int j = 0; j < q.a[0].length; j++) {
                for (int k = 0; k < p.a[0].length; k++) {
                    r.a[i][j] += p.a[i][k] * q.a[k][j];
                }
            }
        }*/
        return new int[0][];
    }
}
