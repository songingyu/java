package week3;
import java.util.Scanner;
public class ContinueEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("5���� ���� �Է�");
		int i=1;
		while(i<=5) {
			System.out.print(i+"��° �����Է�");
			int num = sc.nextInt();
			if(num<0) {
				i++;
				continue;
			}
			sum+=num;
			i++;
		}
		System.out.println("������������ ����"+sum);
	}

}
