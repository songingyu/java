package week3;

public class WhileEX1 {
public static void main(String[] args) {
	int i, sum = 0;
	i=1;
	while(i<=10) {
		sum+=i;
		System.out.print(i);
		i++;
		if(i<=9) {
			System.out.print("+");
		}
		else {
			System.out.print("=");
			System.out.print(sum);
		}
	}
}
}
