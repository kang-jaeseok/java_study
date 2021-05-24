package basic01;

import java.util.Scanner;

/*
 * switch(변수){
 * case 값:
 * }
 * */
public class J20210414_01_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 3;
//		
//		switch(a){
//		case 1:
//			System.out.println("one"); 		break;
//		case 2:
//			System.out.println("two");		break;
//		case 3:
//			System.out.println("three");	break;
//		default:
//			System.out.println("잘못된 숫자");	break;
//		}

		//////////////////////////////////////////////////////////////////////////

//		// h:고등학교, m:중학교, e:초등학교
//		System.out.print("input: ");
//		
//		Scanner sc = new Scanner(System.in);
//		//char c = sc.next().charAt(0);
//		String str = sc.next();
//		
//		switch (str) {
//		case "h":
//			System.out.println("고등학교");
//			break;
//		case "m":
//			System.out.println("중학교");
//			break;
//		case "e":
//			System.out.println("초등학교");
//			break;
//		default:
//			System.out.println("잘못된 입력");
//			break;
//		}

		//////////////////////////////////////////////////////////////////////////

		// 문자열 비교
//		Scanner sc = new Scanner(System.in);
//		String s1 = "java";
//		String s2 = new String("java");
//		String s3 = "java";
//		String s4 = sc.next();
//		if(s1 == s4) System.out.println("같음");
//		else System.out.println("다름");

		//////////////////////////////////////////////////////////////////////////
//		System.out.print("input: ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		switch(a % 2) {
//		case 0:
//			System.out.println("짝수"); break;
//		case 1:
//			System.out.println("홀수"); break;
//		}

////////////////////////////////////////////////////////////////////////////////////

		// 100~90 : A, 89~80 : B
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int score = sc.nextInt();

		switch (score / 10) {
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
////////////////////////////////////////////////////////////////////////////////////

	}

}
