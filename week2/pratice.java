package week2;
import java.util.Scanner;
public class pratice {
public static void main(String args[]) {
	
	System.out.println("?????");
	
	
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.next();
	System.out.println("����� �̸���"+name+"�Դϴ�.");
	
	String city = scanner.next();
	System.out.println("����� ��°���"+city+"�Դϴ�.");
	
	int age = scanner.nextInt();
	System.out.println("����� ���̴�"+age+"�Դϴ�.");
	
	double weight = scanner.nextDouble();
	System.out.println("����� �����Դ�"+weight+"�Դϴ�.");
	
	scanner.close();
}
}
