package basic01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.print("정수 입력: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 0; i <= n; i++) {
//			sum += i;
//		}
//		
//		System.out.println("1부터 "+ n + "까지의 합은 "+sum);

//////////////////////////////////////////////////////////////////////////////////////////////////

		// 실습)

//		int random = (int)(Math.random()*100+1);
//		int n = 5;
//		int answer = 0, tmp = 0;
//		boolean upFlag = false, downFlag = false;
//		Scanner sc = new Scanner(System.in);
//		while(0 < n--) {
//			System.out.print("#"+ (n+1) +")정수 입력: ");
//			answer = sc.nextInt();
//			/*if(upFlag && tmp >= answer) {
//				System.out.println("잘못 입력-");
//						
//				n++;

//				continue;
//			}
//			else if(downFlag && tmp <= answer) {
//				System.out.println("잘못 입력--");

//				n++;
//				continue;
//			}*/
//			if(random > answer && n != 0) {
//				System.out.println("UP");
//				if(!upFlag)	upFlag = !upFlag;
//				tmp = answer;
//			}
//			else if(random < answer && n != 0) {
//				System.out.println("Down");
//				if(!downFlag)	downFlag = !downFlag;
//				tmp = answer;
//			}
//			else break;
//		}
//		if(random == answer) System.out.println("성공");
//		else System.out.println("실패");
//		System.out.println("정답은 " + random + "입니다.");

//		int r = (int)(Math.random()*100 + 1);
//		System.out.println(r);
//		Scanner sc = new Scanner(System.in);
//		int a;
//		for(int i = 0; i < 5; i++) {
//			System.out.printf("%d)숫자를 맞춰라", i+1);
//			//입력값 검사
//			if(!sc.hasNextInt()) {
//				sc.nextLine();  // 버퍼 비우기
//				i--;
//				continue;
//			}
//			a = sc.nextInt();
//			//업다운
//			//...
//			//..
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////

		// 설탕 배달 문제
//		for (int n = 3; n < 100; n++) {
//			System.out.print(String.format("#%2d)", n));
//			if (n == 4 || n == 7)
//				System.out.println("-1");
//
//			else if (n % 5 == 0) {
//				System.out.println("5kg: " + n / 5);
//			} else if (n % 5 == 1) {
//				System.out.println("5kg: " + ((n - 2 * 3) / 5) + " 3kg: 2");
//			} else if (n % 5 == 2) {
//				System.out.println("5kg: " + ((n - 4 * 3) / 5) + " 3kg: 4");
//			} else if (n % 5 == 3) {
//				System.out.println("5kg: " + ((n - 1 * 3) / 5) + " 3kg: 1");
//			} else if (n % 5 == 4) {
//				System.out.println("5kg: " + ((n - 3 * 3) / 5) + " 3kg: 3");
//			}
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////		
		// 소수 출력
//		int j = 0;
//		boolean b = true;
//		System.out.print("정수 입력: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 2; i <= n; i++) {
//			b = true;
//			for (j = 2; j < i; j++) {
//				if (i % j == 0)	{
//					b = false;
//					break;
//				}
//			}
//			if (b) {
//				
//				System.out.println(i + " ");
//			}
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println("-------------------------------------------");
//		int tmp = 0;
//
//		for (int n = 3; n < 31; n++) {
//			System.out.print(String.format("#%2d)", n));
//			if (n == 4 || n == 7)
//				System.out.println("-1");
//
//			if (n % 5 == 0 || n % 5 == 3) { // 5로 나눈 나머지 0, 3
//				System.out.println("5kg: " + n / 5 + " 3kg: " + (n % 5) / 3);
//			} else if (n % 5 == 1 || n % 5 == 2 || n % 5 == 4) { // 5로 나눈 나머지 1, 2, 4 
//				tmp = n;
//				while (tmp > 0) {
//					if (tmp % 5 == 0) {
//						System.out.println("5kg: " + tmp / 5 + " 3kg: " + (n - tmp) / 3);
//						break;
//					}
//					tmp -= 3; // 입력 값을 3씩 줄이는 과정 ex)입력값 16 -> 13 -> 10
//				}
//				if (tmp == 0) // 6 9 12
//					System.out.println("5kg: " + tmp / 5 + " 3kg: " + n / 3);
//			}
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////	

//////////////////////////////////////////////////////////////////////////////////////////////////

	}

}
