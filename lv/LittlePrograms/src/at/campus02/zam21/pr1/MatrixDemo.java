package at.campus02.zam21.pr1;

public class MatrixDemo {
    public static void main(String[] args) {

        // this has nothing to do with the rest of the exercise
        double [][] helpi = new double[3][2];

        // access one element
        helpi[2][0] = 111.111;
        System.out.println(helpi[2][0]);

        // what will happen? Address of 2 dim Arrays
        System.out.println(helpi);

        // what will happen? -> exception
        //System.out.println(helpi[55]);

        // what will happen? -> Address of first Array in Array
        System.out.println(helpi[0]);

        // back to exercise
        double [][] id = generateIdentityMatrix(5);

        printMatrix(id);

    }
    public static void	printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[row].length; ++col) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] generateIdentityMatrix(int	size){
        double [][] idMat = new double [size][size];

        // usually we need two loops for accessing 2 dim arrays
        /*for(int row = 0; row < size; ++row)
        {
            for(int col = 0; col < size; ++col){
                if (row == col){
                    // what would i get with? idMat[row]
                    // one element?
                    idMat[row][col] = 1.0;
                }
                else{
                    idMat[row][col] = 0.0;
                }
            }
        }*/

        // lazy version follows (more efficient)
        for(int idx = 0; idx < size; ++idx)
        {
            idMat[idx][idx] = 1.0;
        }

       return idMat;
    }

}
