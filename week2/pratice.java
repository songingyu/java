package week2;
import java.util.Scanner;
public class pratice {
public static void main(String args[]) {
	
	System.out.println("?????");
	
	
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.next();
	System.out.println("당신의 이름은"+name+"입니다.");
	
	String city = scanner.next();
	System.out.println("당신의 사는곳은"+city+"입니다.");
	
	int age = scanner.nextInt();
	System.out.println("당신의 나이는"+age+"입니다.");
	
	double weight = scanner.nextDouble();
	System.out.println("당신의 몸무게는"+weight+"입니다.");
	
	scanner.close();
}
}
