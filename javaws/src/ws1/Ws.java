package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input command[q, a1, a2, a3, a4]");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			}else if(cmd.equals("a1")){
				// 5~9까지 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 배열의 합과 평균을 출력한다.
				
			} else if(cmd.equals("a2")){
				while(true) {
				// 5~9까지 숫자를 입력 받는다.
				System.out.println("5~9까지의 정수를 입력해 주세요");
				
				String num = sc.next(); //string을
				int num2 = Integer.parseInt(num); //정수로 변환
				if(!(num2>=5 && num2<=9)) { // 5~9자리수가 아니면 프로그램 종료한다.
			         
			         System.out.println("입력이 불가한 수를 사용했습니다.");
			 
			         continue;
			      }
				else {
				// 입력 받은 숫자만큼 배열을 생성 하고
				int [] num3 = new int [num2]; //입력받은 수 만큼 배열사이즈 생성
				
				Random r = new Random(); //랜덤 지정
				int sum = 0;
				int cnt = 0;
				double avg = 0.0;
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				for (int i=0; i<num3.length; i++) { //num3 배열의 길이만큼
					num3 [i] = r.nextInt(9)+1;
					//1~9까지 랜덤숫자 자동입력
					if(i % 2 == 1) { //0부터 인덱스가 시작이니, 홀수번째로 뽑아야 짝수가 나옴
						sum += num3[i];
						cnt++;
					}
				}
				avg = sum / (cnt*1.0);
				// 배열 정보를 출력 한다.
				System.out.println(Arrays.toString(num3));
				
				// 짝수 번째 숫자들의 합과 평균을 출력한다.
				System.out.println(sum);
				System.out.println(avg);
				} 
				 break;} //a2 while 종료 시점
		
				

				
		} else if(cmd.equals("a3")){
				// 5~9까지 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 짝수 값만의 합과 평균을 출력한다.
				
			}else if(cmd.equals("a4")){
				// 5~9까지 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 배열의 합과 평균을 출력한다.
				
			}else {
				System.out.println("Invalid Command..");
				System.out.println("Try Again..");
			}
		} //end while
		
		System.out.println("Bye...");
		sc.close();

	}

}
