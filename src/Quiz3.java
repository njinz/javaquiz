
public class Quiz3 {

	public static void main(String[] args) {
		//사용자가 종료를 입력할때까지 무한 반복하는 프로그램
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		System.out.println("시작합니다");
		while(!str.equals("종료")) {
			System.out.println("종료하려면 종료를 눌러주세요.");
			str=sc.nextLine();
			if(str.equals("종료")) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("무한반복중입니다");
			}
		}

	}

}
