package week4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum =0, n= 0;
		for(int i= 1; i<4; i++)
		{
			System.out.print(i+">>");
		
		try {
			n = sc.nextInt();
		}
		
		catch(InputMismatchException e) {
			System.out.println("������ �ƴմϴ�.�ٽ� �Է����ּ���");
			sc.next();
			i--;
			continue;
		}
		sum +=n;
		}
		System.out.println("����"+sum);
		sc.close();

	}
}
