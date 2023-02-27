package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		

		while (true) {
			System.out.println("Input command[q, a1, a2, a3, a4]");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("Quit..");
				break;
				
			}else if (cmd.equals("a1")) {
			
				while (true) {
					System.out.println("Input Number[5, 6, 7, 8, 9]");
					int n = sc.nextInt();
					int sum = 0;
					double avg = 0;

					if (n >= 5 && n <= 9) {

						int a[] = new int[n];

						for (int i = 0; i < a.length; i++) {

							a[i] = r.nextInt(9) + 1;
						}

						System.out.println(Arrays.toString(a));

						for (int data : a) {
							sum += data;
						}

						avg = sum / (a.length * 1.0);

						System.out.printf("배열의 합은 %d 평균은 %.2f 입니다\n", sum, avg);
						break;

						}
					}

				
				
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

			while(true) {
				System.out.println("5~9까지 숫자를 입력하세요.");
				int cmd3 = Integer.parseInt(sc.next());
				
				if(!(cmd3>=5 && cmd3<=9)) {
					System.out.println("다시 입력하세요.");
					continue;
				}else {
				
			
			
				int[] arr = new int[cmd3];
				for(int i=0; i<arr.length; i++) {
				 arr[i] = r.nextInt(9)+1;
				}
				
				System.out.println(Arrays.toString(arr));
				
				int sum = 0, cnt = 0;
				double avg = 0.0;
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i]%2==0) {
						sum += arr[i];
						cnt++;
					}
				}
				avg = (sum*1.0)/cnt;
				
				System.out.println(sum);
				System.out.println(avg);
				break;}
				
			}
				
			} else if (cmd.equals("a4")) {
				// 5~9까지 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 배열의 합과 평균을 출력한다.

				int row; // 행 변수
				int col; // 열 변수
				int[][] arr2D; // 2차원 array
				int sum = 0; // 합계
				int cnt = 0; // 카운팅
				double avg = 0.0; // 평균

				while (true) {

					// 5~9까지의 숫자를 2개 입력 받는다.
					System.out.println("행을 입력하세요: ");
					row = sc.nextInt();
					if (!(row >= 5 && row <= 9)) {
						System.out.println("5~9까지의 숫자 범위를 초과 하였습니다.");
						continue;
					}

					System.out.println("열을 입력하세요: ");
					col = sc.nextInt();
					if (!(col >= 5 && col <= 9)) {
						System.out.println("5~9까지의 숫자 범위를 초과 하였습니다.");
						continue;
					}

					// 2차원 배열을 만든다.
					arr2D = new int[row][col];

					// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
					for (int i = 0; i < arr2D.length; i++) {
						for (int j = 0; j < arr2D[i].length; j++) {
							arr2D[i][j] = r.nextInt(9) + 1;
						}
					}

					// 배열 정보 출력
					for (int i[] : arr2D) {
						for (int j : i) {
							System.out.print(j + " ");
						}
						System.out.println("");
					}

					// 배열의 합과 평균을 출력한다.
					for (int i[] : arr2D) {
						for (int j : i) {
							sum += j;
							cnt++;
						}
					}
					avg = sum / (cnt * 1.0);
					break;
				}

				System.out.println("행은 " + row + " 열은 " + col + "인 2차원 배열입니다.");
				System.out.println("배열의 합은 " + sum + " , 배열의 평균은 " + avg + " 입니다.");

			} else {

				System.out.println("Invalid Command..");
				System.out.println("Try Again..");
			}
		} // end while
		System.out.println("Bye...");
		sc.close();

	

}
}
