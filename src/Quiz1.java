
public class Quiz1 {

	public static void main(String[] args) {
  
		//1부터 수를 차례로 더하여 입력한 수보다 크면 종료(break사용)
		
  java.util.Scanner sc=new java.util.Scanner(System.in);
  System.out.println("하나의 수를 입력하세요");
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
