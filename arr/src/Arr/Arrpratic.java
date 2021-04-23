package Arr;

public class Arrpratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [3][3];
		int[][] arr1 = new int [3][3];
		int[][] arr2 = new int [3][3];
		int a = 3;
		
		for (int i=0; i<a; ++i) {
			for (int j=0; j<a; ++j) {
				arr[i][j] = 3*i+j+1;
				arr1[i][j] = 9-3*i-j;
			}
		}
		
		for (int i=0; i<a; ++i) {
			for (int j=0; j<a; ++j) {
				arr2[i][j] = 0;
				for (int k=0; k<a; ++k) {
					arr2[i][j] = arr2[i][j] + (arr[i][k]*arr1[k][j]);
				}
			}
		}
		
		System.out.printf("arr = \n");
		for (int i=0; i<a; ++i) {
			for (int j=0; j<a; ++j) {
				System.out.printf("%d ", arr[i][j]);
				System.out.printf("\t");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("arr1 = \n");
		for (int i=0; i<a; ++i) {
			for (int j=0; j<a; ++j) {
				System.out.printf("%d ", arr1[i][j]);
				System.out.printf("\t");
			}
			System.out.printf("\n");
		}
		System.out.printf("arr*arr1 = \n");
		for (int i=0; i<a; ++i) {
			for (int j=0; j<a; ++j) {
				System.out.printf("%d ", arr2[i][j]);
				System.out.printf("\t");
			}
			System.out.printf("\n");
		}
	}
	
}
