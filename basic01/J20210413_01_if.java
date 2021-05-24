package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("두수 입력: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2)			System.out.println(num1);
//		else if(num2 > num1)	System.out.println(num2);
//		else 					System.out.println("같음");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 : ");
//		int score = sc.nextInt();
//		if (score < 0 || score > 100)	System.out.println("입력오류");
//		else if(score >= 90)	System.out.println("A등급");
//		else if(score >= 80)	System.out.println("B등급");
//		else if(score >= 70)	System.out.println("C등급");
//		else if(score >= 60)	System.out.println("D등급");
//		else if(score <  60)	System.out.println("F등급");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("전체 인원수 : ");
//		int total = sc.nextInt();
//		System.out.print("등수 : ");
//		int rank = sc.nextInt();
//		if(total*0.15 >= rank)		System.out.println("A학점");
//		else if(total*0.35 >= rank) System.out.println("B학점");
//		else if(total*0.50 >= rank) System.out.println("C학점");
//		else System.out.println("F학점");

		// 실습) 화씨(F) <=> 섭씨(C)로 바꾸기
		// 섭씨 온도 = (화씨 온돈 -32)*5/9
		// 화씨 온도 = 섭씨온도 * 9/5 + 32
		// 온도 10 C 또는 100 F

//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도 단위 입력 : ");
//		double temp = sc.nextDouble();
//		String dgree = sc.next();
//		
//		double result;
//	
//		if(dgree.equals("C")) {
//			result = temp * 9 / 5 + 32;
//			System.out.println("섭씨 -> 화씨 : " + (double)Math.round(result*100)/100);
//		
//		}else if(dgree.equals("F")) {
//			result = (temp - 32) * 5 / 9;
//			System.out.println("화씨 -> 섭씨 : " + (double)Math.round(result*100)/100);
//		
//		}else System.out.println("입력 오류");

		// 실습) 계산기
		// 입력 10 + 20

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("계산식 입력 ");
//
//		try {
//			int num1 = sc.nextInt();
//			String oper = sc.next();
//			int num2 = sc.nextInt();
//			
//		}catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요.");
//		}

//		if(oper.equals("+")) 		System.out.println(num1 + num2);
//		else if(oper.equals("-")) 	System.out.println(num1 - num2);
//		else if(oper.equals("*")) 	System.out.println(num1 * num2);
//		else if(oper.equals("/")) 	System.out.println(String.format("%.2f", (double)num1 / num2));

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		
//		//코드인스펙션
//		if( !(sc.hasNextInt())) {
//			System.out.println("숫자 아님");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}

		// 아이디와 패스워드를 입력받아 로그인 성공여부를 결정짓는 프로그램을 만들어 보시오

//		String myid = "java";
//		String mypw = "1111";
////		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디는?");
//		String id = sc.next();
//		
//		if(myid.equals(id)) {
//			
//			System.out.print("비밀번호는?");
//			String pw = sc.next();
//			if(pw.equals(mypw)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호 불일치");
//			}
//		}else {
//			System.out.println("id가 불일치");
//		}
		//////////////////////////////////////////////////////////
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ID 입력 : ");
//		String inputId = sc.next();
//		if(myid.equals(inputId)) {
//			System.out.println("id가 일치합니다.");
//		}
//		else {
//			System.out.println("id가 일치하지 않습니다  로그인 실패");
//			return ;
//		}
//		System.out.println("PW 입력 : ");
//		String inputPw = sc.next();
//		if(mypw.equals(inputPw)) {
//			System.out.println("pw가 일치합니다.");
//			System.out.println("로그인 성공");
//		}
//		else {
//			System.out.println("pw가 일치하지 않습니다  로그인 실패");
//			return ;
//		}

		//------------------------------------------------------------------------------------------
		// 500 = 7300 + (200 * 88.3) + ( 200 * 182.9 ) + ( 100 * 275.6 )

//		double section1 = 88.3, section2 = 182.9, section3 = 275.6;
//
//		int base = 0;
//		double amount = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용량 : ");
//		double kWh = sc.nextInt();
//		if (kWh <= 200) {
//			base = 910;
//			amount = (base + kWh * section1);
//		} else if (kWh <= 400) {
//			base = 1600;
//			amount = (base + (kWh - 200) * section2 + 200 * section1);
//		} else {
//			base = 7300;
//			amount = (base + (kWh - 400) * section3 + 200 * section2 + 200 * section1);
//
//		}
//		//amount = Double.parseDouble(String.format("%.0f", amount));
//		
//		System.out.println((int)amount);
//		//System.out.println("사용요금 :" + String.format("%.0f" ,(Math.floor(amount))));

		
		//------------------------------------------------------------------------------------------
		// 윤년체크
		// 년을 입력받고 윤년체크
//		System.out.print("년 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
//			
//			System.out.println(year + " 윤년");
//		}else {
//			System.out.println(year + " 윤년 아님");
//		}

		//------------------------------------------------------------------------------------------
		// 적정 몸무게

//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름: ");
//		String name = sc.next();
//		System.out.print("신장: ");
//		double height = sc.nextInt();
//		System.out.print("몸무게: ");
//		double weight = sc.nextInt();
//	
//		double avgweight = (height - 100) * 0.9;
//
//		System.out.println(avgweight * 1.05 + " " + avgweight * 0.95 + " " + weight);
////		if (weight > avgweight * 1.05) {
////			System.out.println(name + ": 과체중");
////		} else if (weight < avgweight * 0.95) {
////			System.out.println(name + ": 체중미달");
////		} else {
////			System.out.println(name + ": 적정체중");
////		}
//		
//		if (weight < avgweight * 0.95 ) {
//			System.out.println(name + ": 체중미달");
//		} else if (weight <= avgweight * 1.05) {
//			System.out.println(name + ": 적정체중");
//		} else {
//			System.out.println(name + ": 과체중");
//		}
		//------------------------------------------------------------------------------------------
//		System.out.println((int)(Math.random()*6+5)); //5~11
//		System.out.println((int)(Math.random()*10+11)); //11~20

		//주사위게임
		//a와 b의 숫자 비교
		//------------------------------------------------------------------------------------------
		int a = (int)(Math.random()*6+1);
		int b = (int)(Math.random()*6+1);
		
		System.out.println("a: " + a + " b: " + b);
		
		if(a > b) 		System.out.println("a승");
		else if(b > a)	System.out.println("b승");
		else 			System.out.println("무승부");
		
	}
}












