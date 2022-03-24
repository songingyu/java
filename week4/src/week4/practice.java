package week4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum =0, n= 0;
		for(int i= 1; i<4; i++)
		{
			System.out.print(i+">>");
		
		try {
			n = sc.nextInt();
		}
		
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다.다시 입력해주세요");
			sc.next();
			i--;
			continue;
		}
		sum +=n;
		}
		System.out.println("합은"+sum);
		sc.close();

	}
}
