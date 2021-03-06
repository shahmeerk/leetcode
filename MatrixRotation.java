public class MatrixRotation {
    public void rotate(int[][] matrix) {

        int length = matrix.length;
        int temp;

        //Transpose the matrix (only works for square matrices)
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Swap the first n/2 elements with their respective last elements
        for(int i =0; i < length; i++){
            for(int j = 0; j < length / 2; j++){
                temp = matrix[i][j];

                //swap i.e element [0][0] with element [0][2] (for 3x3 matrix)
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = temp;
            }
        }
    }
}
