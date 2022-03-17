package week3;
import java.util.Scanner;
public class BreakEX1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료");
//		while(true) {
//			System.out.print(">>");
//			String txt = sc.next();
//			if(txt.equals("exit")) break;
//		}
		for(;;) {
			System.out.print(">>");
			String txt = sc.next();
			if(txt.equals("exit")) break;
		}
		System.out.println("종료합니다");
	}

}
