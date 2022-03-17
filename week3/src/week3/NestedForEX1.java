package week3;

public class NestedForEX1 {
public static void main(String[]args) {
	for(int i=1; i<10; i++) {
		for(int k=1; k<10; k++) {
//			System.out.print(i+"*"+k+"="+i*k);
			System.out.printf("%d*%d=%d",i, k, i*k);
			System.out.print('\t');
		}
		System.out.println();
	}
}
}
