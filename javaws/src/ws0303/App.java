package ws0303;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		APP_Receiving ar = new APP_Receiving();
		APP_Loan al = new APP_Loan();
		
		System.out.println("== 안녕하십니까 고객님, KB국민은행에 오신 것을 환영합니다! ==");
		
		while(true) {
			System.out.println("== 거래하실 메뉴를 숫자로 입력해주세요 == ");
			System.out.println("1.입출금/적금계좌, 2.대출계좌, 3.나가기");
			String menu = sc.next(); // 첫번째 메뉴를 입력받는다.
			
			try {
				// 정수로 변환 가능한 값이 들어오면
				if(Integer.parseInt(menu)==3) {
					System.out.println("== 고객님 KB국민은행을 거래해주셔서 감사합니다 == ");
					break;
				}else if(Integer.parseInt(menu)==1) {
					// 1.입출금/적금계좌 호출	
					ar.app_r();
				}else if(Integer.parseInt(menu)==2) {
					// 2.대출계좌 호출
					al.app_l();
				}else {
					System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
				}
			}catch(NumberFormatException e) {
				System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
			}
		}
	}
}
