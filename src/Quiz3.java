
public class Quiz3 {

	public static void main(String[] args) {
		//����ڰ� ���Ḧ �Է��Ҷ����� ���� �ݺ��ϴ� ���α׷�
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		System.out.println("�����մϴ�");
		while(!str.equals("����")) {
			System.out.println("�����Ϸ��� ���Ḧ �����ּ���.");
			str=sc.nextLine();
			if(str.equals("����")) {
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println("���ѹݺ����Դϴ�");
			}
		}

	}

}
