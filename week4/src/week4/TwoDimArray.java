package week4;

import java.util.Iterator;

public class TwoDimArray {
	public static void testArr(double[][] abc) {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		double sum = 0;
		double score [][]=  {{4.5, 4.0},
							{3.5,4.3},
							{2.0,4.5}};
		for (int i = 0; i <score.length; i++) {
			for(int j = 0; j<score[0].length; j++) {
				sum+= score[i][j];
			}
		}
		int n =score.length;
		int m = score[0].length;
		double avg = sum/ (n*m);
		System.out.println("����"+ sum +"�̰�"+ "�����"+avg+"�Դϴ�.");
		testArr(score);
	}

}