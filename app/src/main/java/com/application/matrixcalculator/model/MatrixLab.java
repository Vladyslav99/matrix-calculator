package com.application.matrixcalculator.model;

public class MatrixLab {

    private final int DEFAULT_MATRIX_SIZE = 3;

    private static MatrixLab sMatrixLab;

    private int[][] mAMatrix;
    private int[][] mBMatrix;
    private int[][] mResultMatrix;
    private float[][] mReverseMatrix;

    private MatrixLab(){
        mAMatrix = new int[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
        mBMatrix = new int[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public static MatrixLab getInstance(){
        if (sMatrixLab == null){
            sMatrixLab = new MatrixLab();
        }

        return sMatrixLab;
    }

    public int[][] sum(int[][] aMatrix, int[][] bMatrix){

        if (aMatrix.length == bMatrix.length && aMatrix[0].length == bMatrix[0].length){

            mResultMatrix = new int[aMatrix.length][aMatrix.length];

            for (int i = 0; i < aMatrix.length; i++){
                for (int j = 0; j < aMatrix[0].length; j++){
                    mResultMatrix[i][j] = aMatrix[i][j] + bMatrix[i][j];
                }
            }

            return mResultMatrix;
        }

        return null;
    }

    public int[][] subtract(int[][] aMatrix, int[][] bMatrix){

        if (aMatrix.length == bMatrix.length && aMatrix[0].length == bMatrix[0].length){

            mResultMatrix = new int[aMatrix.length][aMatrix.length];

            for (int i = 0; i < aMatrix.length; i++){
                for (int j = 0; j < aMatrix[0].length; j++){
                    mResultMatrix[i][j] = aMatrix[i][j] - bMatrix[i][j];
                }
            }

            return mResultMatrix;
        }

        return null;
    }

    public int[][] multiplication(int[][] aMatrix, int[][] bMatrix){

        if (aMatrix.length == bMatrix.length && aMatrix[0].length == bMatrix[0].length){

            mResultMatrix = new int[aMatrix.length][bMatrix[0].length];

            for (int row = 0; row < mResultMatrix.length; row++){
                for (int col = 0; col < mResultMatrix[row].length; col++){
                    mResultMatrix[row][col] = multiplyMatricesCell(aMatrix, bMatrix, row, col);
                }
            }

            return mResultMatrix;
        }

        return null;
    }

    private int multiplyMatricesCell(int[][] aMatrix, int[][] bMatrix, int row, int col){
        int cell = 0;

        for (int i = 0; i < bMatrix.length; i++){
            cell += aMatrix[row][i] * bMatrix[i][col];
        }

        return cell;
    }

    public int determinantOfMatrix(int matrix[][], int size){
        int determinant = 0;
        int[][] temp = new int[matrix.length][matrix.length];
        int sign = 1;

        if (size == 1){
            return matrix[0][0];
        }

        for (int i = 0; i < matrix.length; i++){
            getCofactor(matrix, temp, 0, i, size);
            determinant+=sign * matrix[0][i] * determinantOfMatrix(temp, size - 1);

            sign = -sign;
        }

        return determinant;
    }

    private void getCofactor(int [][] matrix, int [][] temp, int p, int q, int n){
        int i = 0, j = 0;

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){

                if (row != p && col != q){
                    temp[i][j++] = matrix[row][col];

                    if (j == n-1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public boolean inverse(int[][] matrix){
        int det = determinantOfMatrix(matrix, matrix.length);

        mReverseMatrix = new float[matrix.length][matrix.length];

        if (det == 0){
            return false;
        }

        int [][] adj = new int[matrix.length][matrix.length];
        adjoint(matrix, adj);

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                mReverseMatrix[i][j] = adj[i][j]/(float)det;

        return true;
    }

    private void adjoint(int[][] matrix, int [][] adj){
        if (matrix.length == 1){
            adj[0][0] = 1;
            return;
        }

        int sign = 1;

        int[][] temp = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                getCofactor(matrix, temp, i, j, matrix.length);

                sign = ((i + j) % 2 == 0) ? 1 : -1;

                adj[j][i] = (sign)*determinantOfMatrix(temp, matrix.length-1);
            }
        }
    }

    public void fillAMatrixWithZero(){
        for (int i = 0; i < mAMatrix.length; i++){
            for (int j = 0; j < mAMatrix[0].length; j++){
                mAMatrix[i][j] = 0;
            }
        }
    }

    public void fillBMatrixWithZero(){
        for (int i = 0; i < mBMatrix.length; i++){
            for (int j = 0; j < mBMatrix[0].length; j++){
                mBMatrix[i][j] = 0;
            }
        }
    }

    public void changeAMatrixSize(int rows, int columns){
        mAMatrix = new int[rows][columns];
    }

    public void changeBMatrixSize(int rows, int columns){
        mBMatrix = new int[rows][columns];
    }

    public void resizeMatrix(String matrixName, String sizeType, int size){
        if (matrixName.equals("MatrixA")){
            if (sizeType.equals("rows")){
                mAMatrix = new int[size][mAMatrix[0].length];
            }
            else {
                mAMatrix = new int[mAMatrix.length][size];
            }
        }
        else {
            if (sizeType.equals("rows")){
                mBMatrix = new int[size][mBMatrix[0].length];
            }
            else {
                mBMatrix = new int[mBMatrix.length][size];
            }
        }
    }

    public float[][] getReverseMatrix() {
        return mReverseMatrix;
    }

    public boolean ifSumOrSubValid(){
        if (mAMatrix.length == mBMatrix.length && mAMatrix[0].length == mBMatrix[0].length)
            return true;

        return false;
    }

    public boolean ifMultiplicationValid(){
        if (mAMatrix.length == mBMatrix[0].length && mAMatrix[0].length == mBMatrix.length)
            return true;

        return false;
    }

    public int[][] getResultMatrix(){
        return mResultMatrix;
    }

    public int[][] getAMatrix() {
        return mAMatrix;
    }

    public void setAMatrix(int[][] aMatrix) {
        mAMatrix = aMatrix;
    }

    public int[][] getBMatrix() {
        return mBMatrix;
    }

    public int[][] getMatrixByName(String matrixName){
        if (matrixName.equals("MatrixA")){
            return mAMatrix;
        }

        return mBMatrix;
    }

    public void setBMatrix(int[][] bMatrix) {
        mBMatrix = bMatrix;
    }
}
