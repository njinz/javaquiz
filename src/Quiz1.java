
public class Quiz1 {

	public static void main(String[] args) {
  
		//1���� ���� ���ʷ� ���Ͽ� �Է��� ������ ũ�� ����(break���)
		
  java.util.Scanner sc=new java.util.Scanner(System.in);
  System.out.println("�ϳ��� ���� �Է��ϼ���");
  int input=sc.nextInt();
  int num=0;
  int i=1;
  while(true){
	  num+=i;
	  if(input<num) {
		  break;
	  }

	  System.out.println("~"+i+":"+num);
	  i++;
  }
	}

}
