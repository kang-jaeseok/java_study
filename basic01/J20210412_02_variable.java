package basic01;

import java.math.BigDecimal;

public class J20210412_02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10, b = 3;
//		
//		
//		System.out.println(a + " + " + b + " = " + (a+b));
//		System.out.println(a + " - " + b + " = " + (a-b));
//		System.out.println(a + " * " + b + " = " + (a*b));
//		System.out.println(a + " / " + b + " = " + ((double)a/b));
//		System.out.println(a + " % " + b + " = " + (a%b));
//		
//		System.out.println();
//
//		System.out.printf("%d + %d = %d\n", a, b, (a+b));
//		System.out.printf("%d - %d = %d\n", a, b, (a-b));
//		System.out.printf("%d * %d = %d\n", a, b, (a*b));
//		System.out.printf("%d / %d = %.2f\n", a, b, ((double)a/b));
//		System.out.printf("%d %% %d = %d\n", a, b, (a%b));
		
		//실수형
		
//		float f = 3.14f;
//		double d = 3.14;
//		System.out.println(f);
//		
//		double d = 608.4, d2 = 206.2;
//		System.out.println( d + d2);  // 814.59999999999999출렭
//		System.out.printf("%.1f\n", d+d2);
//		
		
		//정확한 계산을 해야 할 경우
		
//		BigDecimal b1 = new BigDecimal("608.4");
//		BigDecimal b2 = new BigDecimal("206.2");
//		
//		BigDecimal result = b1.add(b2);
//		
//		System.out.println(result);
		
		//문자형
		
//		char c = 'a';
//		System.out.println(c);
//		
//		char c2 = '가';
//		System.out.println(c2);
//		System.out.println(c2+0);//코드화 (유니코드 값 출력)
//		
		
		//논리형
//		boolean b = true;
//		System.out.println(b);
		
		//문자열은 형이 없다. 
		//참조형
		
//		String s1 = new String("java");
//		String s2 = "Java";
//		System.out.println(s1);
//		System.out.println(s2);
		
		//형변환
		//자동형변환
		//명시적형변환
		
//		byte b = 10;
//		int a = b;  //자동 형변환 (작은 형이 큰형으로 자동형변환)
//		
//		byte c = (byte)a; //명시적인 형변황(큰형이 작은형으로 변환)
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
		//상수 
 		
//		final int a = 10;
//		//a = 20;
//		final float PI = 3.14f;
//		//PI = 5.5f; // 상수는 변경 불가능
//		System.out.println(PI);
		
		
		double a = 608.4, b = 206.2;
		double result = (a*10+b*10);
		System.out.println(result/10);
		
		
		
			
		
		
		
		
		
	}

}

