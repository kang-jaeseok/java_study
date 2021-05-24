package basic01;

public class J20210412_03_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자
		//삼항연산자
//		int a = 10;
//		String b = (a > 0) ? "양수" : (a < 0) ? "음수" : "0";
//		System.out.println(b );
//		//System.out.println((a > 0) ? "양수" : (a < 0) ? "음수" : "0" );
		
		//실습) 두수중에서 큰수 출력
//		int a = 100, b = 50;
//		int c = (a > b) ? a : b;
//		System.out.println(c);
//		System.out.println((a > b) ? a : (a < b) ? b : "같음" );
		
		//실습) 세주중 큰수 출력
		
		int a = 200, b = 500, c = 1000;
//		
//		int max = (a > b) ? (( a > c ) ? a : c ) : ((b > c) ? b : c) ;
		int max = a > b ? a : b;
		max = max > c ? max : c; // a > c ? a : c  // b > c ? b : c
		// max = a > b ? a > c ? a : c : b > c ? b : c
		System.out.println(max);
		//		System.out.println(max);
//		
//		//실습) 짝홀수 출력하기
//		int odd = 11;
//		System.out.println( (odd % 2 == 0) ? "짝수" : "홀수" );
//		
//		//실습) 세과목이 모두 60점이 넘으면 합격 아니면 불합격
//		int kor = 90, eng = 85, math = 59;
//		
//		System.out.println( (kor >= 60 && eng >= 60 && math >= 60) ? "합격" : "불합격");
		
		
	}

}
