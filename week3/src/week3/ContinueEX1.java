package week3;
import java.util.Scanner;

public class ContinueEX1 {
public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
 	System.out.println("���� 5�� �Է�");
 	int sum = 0;
 	for(int i=0; i<5; i++) {
 		System.out.printf("%d��° ����:" ,i+1);
 		int n = sc.nextInt();
 		if(n<=0)
 			continue;
 		else sum+=n;
 		
 	}
 	System.out.println("����� ����"+ sum);
 	sc.close();
}
}
