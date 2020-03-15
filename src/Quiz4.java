
import java.util.Scanner;
public class Quiz4 {

	public static void main(String[] args) {
		//다섯개의 숫자 입력해 더해주는 프로그램
		Scanner sc=new Scanner(System.in);
		int i=0;
		int input=0;
		int sum=0;
		for(i=1;i<6;i++) {
			System.out.print(i+"번째 정수를 입력하세요: ");
			input=sc.nextInt();
				if(input<0) {
				input=-input;
				}
			sum+=input;
			
			}
		System.out.println("다섯개 정수의 합:"+sum);
	
		}
		

	

}
