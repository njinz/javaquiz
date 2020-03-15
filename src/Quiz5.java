import java.util.Scanner;
public class Quiz5 {
	//2씩 감소하는 a와 3씩 증가하는 b , a-b<0이면 종료
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		System.out.println("수를 입력하세요");
		int input=sc.nextInt();
		for(int i=1;;i++) {
			a=input-2*i;
			b=3*i;
			if(a-b<0) {
				System.out.println("a의 값은:"+a+" b의 값은: "+b);
				System.out.println("a-b<0때까지의 횟수는"+i);
				break;
			}
			
			
		}
	}

}
