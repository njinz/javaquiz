
import java.util.Scanner;
public class Quiz4 {

	public static void main(String[] args) {
		//�ټ����� ���� �Է��� �����ִ� ���α׷�
		Scanner sc=new Scanner(System.in);
		int i=0;
		int input=0;
		int sum=0;
		for(i=1;i<6;i++) {
			System.out.print(i+"��° ������ �Է��ϼ���: ");
			input=sc.nextInt();
				if(input<0) {
				input=-input;
				}
			sum+=input;
			
			}
		System.out.println("�ټ��� ������ ��:"+sum);
	
		}
		

	

}
