package ws0303;

import java.util.Scanner;

public class APP_Receiving {
	
	String accName;
	String accType;
	
//	Account[] acc = {new Receiving(), new Loan()};
	Account[] acc;
	int cnt=0; // 계좌 배열
	
	public void app_r() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("== 입출금/적금계좌 중 거래하실 종류를 숫자로 입력해주세요 ==");
			System.out.println("1.입출금 거래할게요, 2.적금 거래할게요, 3.그냥 나갈게요");	
			String menu = sc.next(); // 두번째 메뉴를 입력받는다.
			
			try {
				if(Integer.parseInt(menu)==3) {
					System.out.println("== 네! 나가겠습니다. == ");
					break;
				}else if(Integer.parseInt(menu)==1) {
					System.out.println("환영합니다 고객님, 입출금 화면 입니다.");
					// 입출금 호출
					deposit();
					break;
				}else if(Integer.parseInt(menu)==2) {
					System.out.println("환영합니다 고객님, 적금 화면 입니다.");
					// 적금 호출
					saving();
					break;
				}else {
					System.out.println("== 고객님 번호를 다시 확인해주시기 바랍니다. ==");
				}
			}catch(NumberFormatException e) {
				System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
			}	
		}
	}
	// deposit
	public void deposit() {
		
		Scanner sc = new Scanner(System.in);
		String menu2;

		System.out.println("== 계좌를 신규하겠습니다. ==");
		System.out.println("== 이름을 입력해주세요. ==");
		accName = sc.next();
		System.out.println("== 신규하실 계좌 종류를 번호로 입력해주세요(1. 입출금계좌, 2. 적금계좌)");
		accType = sc.next();
		
		try {
			if(Integer.parseInt(accType)==1) {
				System.out.println("== 입출금계좌를 선택하셨습니다. ==");
//				acc[cnt] = new Account(); // 배열에 넣는다. 변경필요
//				System.out.println(acc[cnt].toString()); // 변경필요
//				
				System.out.println("== 입금하시려면 1번을, 출금하시려면 2번을 입력해주세요! ==");
				menu2 = sc.next();
				
				try {
					if(Integer.parseInt(menu2)==1) {
						// 입금
					}else if(Integer.parseInt(menu2)==2) {
						// 출금
					}else {
						System.out.println("== 고객님 번호를 다시 확인해주시기 바랍니다. ==");
					}
				}catch(NumberFormatException e) {
					System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
				}	
				
			}else if(Integer.parseInt(accType)==2) {
				System.out.println("== 적금계좌를 선택하셨습니다 ==");
				
			}else {
				System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
			}
		}catch(NumberFormatException e) {
			System.out.println("== 고객님 메뉴 번호를 다시 확인해주시기 바랍니다. ==");
		}	
	}
	
	// saving
	public void saving() {
		
	}
}

