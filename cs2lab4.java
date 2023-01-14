import java.util.Scanner;

public class cs2lab4 {

	/*
	 * Computer Science 2 Lab 4 Algebra: multiply two matrices
	 *
	 * This program prompts the user to input two 3x3 matrices which are then
	 * displayed in a matrix format. The two matrices are then multiplied by each
	 * other and their output is displayed in a matrix format.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first 3x3 matrix : ");
		double[][] matrix1 = new double[3][3];
		for (int i = 0; i < matrix1.length; i++)
			for (int k = 0; k < matrix1[i].length; k++)
				matrix1[i][k] = input.nextDouble();

		System.out.print("Please enter your second 3x3 matrix: ");
		double[][] matrix2 = new double[3][3];
		for (int i = 0; i < matrix2.length; i++)
			for (int k = 0; k < matrix2[i].length; k++)
				matrix2[i][k] = input.nextDouble();

		double[][] multMatrix = multiplyMatrix(matrix1, matrix2);

		for (int i = 0; i < matrix1.length; i++) {

			for (int k = 0; k < matrix1[i].length; k++) {
				System.out.printf("%2.1f ", matrix1[i][k]);
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " + ");
				else
					System.out.printf("%3s ", " ");
			}
			for (int k = 0; k < matrix2[i].length; k++) {
				System.out.printf("%2.1f ", matrix2[i][k]);
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " = ");
				else
					System.out.printf("%3s ", " ");

			}
			for (int k = 0; k < multMatrix[i].length; k++) {
				System.out.printf("%4.1f ", multMatrix[i][k]);
			}
			System.out.println(" ");

		}
		input.close();
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] multMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[0].length; k++) {
				multMatrix[i][k] = a[i][k] * b[i][k];
			}
		}

		return multMatrix;
	}
}
