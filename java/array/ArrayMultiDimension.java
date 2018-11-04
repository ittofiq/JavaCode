package array;

public class ArrayMultiDimension {

	public static void main(String[] args) {
		int[][] num = new int[3][3];
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[1][0] = 10;
		num[1][1] = 11;
		num[1][2] = 12;
		num[2][0] = 0;
		num[2][1] = 0;
		num[2][2] = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
