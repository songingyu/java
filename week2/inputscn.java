package week2;

import java.util.Scanner;

public class inputscn {
	public static void main(String[] args) {
		int a;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�");
		a=sc.nextInt();
		
		System.out.print("�̸��Է�");
		name =sc.next();
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close();
	}

}
