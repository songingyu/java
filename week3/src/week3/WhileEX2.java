package week3;
import java.util.Scanner;
public class WhileEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, score, sum = 0;
		double avg;
		
		System.out.println("성적을 입력하세요(0:종료)");
		
		while((score = sc.nextInt())!=0) {
			sum+=score;
			cnt++;
		}
		avg = (double)sum/ cnt;
		System.out.println("성적의 합은"+sum+"이고 성적의 평균은"+avg+"입니다.");
	}

}
