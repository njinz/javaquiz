import java.util.Scanner;
public class Quiz5 {
	//2�� �����ϴ� a�� 3�� �����ϴ� b , a-b<0�̸� ����
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		System.out.println("���� �Է��ϼ���");
		int input=sc.nextInt();
		for(int i=1;;i++) {
			a=input-2*i;
			b=3*i;
			if(a-b<0) {
				System.out.println("a�� ����:"+a+" b�� ����: "+b);
				System.out.println("a-b<0�������� Ƚ����"+i);
				break;
			}
			
			
		}
	}

}
