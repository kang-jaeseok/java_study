package basic01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//사용자에게 입력받기
//		System.out.print("정수는? ");
//		Scanner sc =new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println("입력받은 값은 : " +a);
		
		
		//반지름을 입력받아 원의 넓이 구하기
		
//		System.out.print("반지름 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		double r = sc.nextDouble();
//		System.out.println("원의 넓이는 " + (r*r*Math.PI));
		
		//문자열을 입력받을때
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은? ");
//		String name = sc.next();
//		System.out.println("당신의 이름: "+name);
		
		//한줄을 읽어들이는 메소드(Enter 기준)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름? ");
//		String name = sc.nextLine();
//		System.out.println("이름은 " + name);
		
		//나이와 이메일을 입력받아 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이? ");
//		int age = sc.nextInt();
//		System.out.print("이메일은? ");
//		
//		String email = sc.next();
//		System.out.print("이름? ");
//		sc.nextLine(); //Enter 처리 .. ,Buffer clear
//		String name = sc.nextLine();
//		
//		System.out.println("나이: " + age);
//		System.out.println("E메일: " + email);
//		System.out.println("이름 : " + name);
		
		//실습)반, 이름, python, c, java 점수를 입력받아
		//반, 이름 출력, 과목 총점, 평균 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반? ");
//		int a = sc.nextInt();
//		System.out.print("이름 ");
//		sc.nextLine();
//		String name = sc.nextLine();
//		
//		
//		
//		System.out.print("Python ");
//		int p = sc.nextInt();
//		
//		System.out.print("C ");
//		int c = sc.nextInt();
//		
//		System.out.print("Java? ");
//		int j = sc.nextInt();
//		
//		System.out.println(a + " " + name);
//		System.out.println("합: " + (p+c+j) +  " 평균: " + ((double)p+c+j)/3);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반 이름? ");
		String ban = sc.next();
		String name = sc.nextLine();
		
		System.out.print("python c java ? ");
		int p = sc.nextInt();
		int c = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("---------------------------------");
		System.out.println("반:" + ban);
		System.out.println("이름:" + name);
		int sum = p + c + j;
		double avg = (double)sum /3 ;
		
		System.out.println("총점: " + (sum) +  " 평균: " + (double)Math.round(avg*100)/100); 
		//System.out.println("총점: " + (sum) +  " 평균: " + String.format("%.2f", avg));
	}

}











