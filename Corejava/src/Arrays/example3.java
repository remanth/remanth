package Arrays;

public class example3 {

	public static void main(String[] args) {
		int[][] x= new int[3][];
		x[0] = new int[2];
		x[1] = new int[3];
		int[][][] y = new int[4][][];
		y[0] = new int[4][];
		y[0][0] = new int[2];
		y[0][1] = new int[2];
		y[0][2] = new int [4];
		y[0][3] =new int[2];
		System.out.println(y[0][0]);
		System.out.println(y[0][1]);
		System.out.println(y[0][2]);
		System.out.println(y[0][3]);

		
		}

}
