public class MatrixRotation {
    public void rotate(int[][] matrix) {

        int length = matrix.length;
        int temp;

        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0; i < length; i++){
            for(int j = 0; j < length / 2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = temp;
            }
        }
    }
}
