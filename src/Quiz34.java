

public class Quiz34 {

	public static void main(String[] args) {
	 //������� �ڵ�����
		
	 System.out.println("��������� �ڵ����� �����մϴ�");
	 int correctCount=0;
	 int wrongCount=0;
	
	 while(true) {
     int n1=(int)(Math.random()*100);
	 int n2=(int)(Math.random()*100);
	 int result=(int)(Math.random()*100);
	 
	 System.out.println(n1+"+"+n2+"="+result);
	 if(result==n1+n2) {
		 System.out.println("�¾ҽ��ϴ�");
		 correctCount++;
	 }else {
		 System.out.println("Ʋ�Ƚ��ϴ�");
		 wrongCount++;
	 }
	 if(wrongCount==3) 
			break;
	}
	 System.out.println("3���̻� Ʋ���̽��ϴ�");
	 System.out.println("����Ƚ��:"+correctCount+"Ʋ��Ƚ��:"+wrongCount);
	 System.out.println("�����մϴ�");
	 
	 
	 }
		
		
		
		
	}

