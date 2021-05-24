package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		int cnt = 5;
//		int[] arr; //선언은 stack
//		//배열은 heap
//		//자바는 동적배열
//		arr = new int[cnt]; //객체를 생성해서 arr에 주소 대입  
//		arr[0] = 10;
//		System.out.println(arr[0]);

//		int[] arr = new int[5];
//			
//		for(int i = 0; i < 5; i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
//		}
		// 선언과 초기화: 반드시 사이즈 생략
//		int[] arr = new int[]  {10, 20, 30};
//		int[] arr = {10, 20, 30};
//		
//		for(int i  = 0; i < arr.length; i++) System.out.println(arr[i]);
//		
//		//for ~ each문
//		for(int a: arr) System.out.println(a);
//		
//		
//		System.out.println(Arrays.toString(arr)); //오버로딩
//		System.out.println(arr.toString());//오버라이딩
//		System.out.println(arr); //println 메소드는 toString() 실행

		// 합계 평균
//		int[] score = {88, 97, 77};
//		int sum = 0;
//		
//		for(int a : score) 	sum += a;
//		
//		double avg = (double)sum/3;
//		//System.out.println("합계: " + sum + " 평균: " + String.format("%.2f", (double)sum/score.length));
//		System.out.println("" + Math.round( (avg)*100 )/100.0);

//		Scanner sc = new Scanner(System.in);
//		
//		int [] score = new int[3];
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.print("#"+ (i+1) + "번 학생 점수: ");
//			score[i] = sc.nextInt();
//		}
//		int sum = 0 ;
//		double avg = 0;
//		
//		for(int a: score) sum += a;
//		
//		avg = (double)sum/score.length;
//		System.out.println("합계: " + sum + " 평균: " + Math.round(avg*100)/100.0);

		// 문자열배열
//		String[] arr = new String[] {"java", "python", "c"};
//		
//		for(String a: arr) System.out.println(a);

		// 실습) 좋아하는 색깔을 3개 입력받아 배열에 저장 / 출력

//		String[] arr = new String[3];
//		Scanner sc= new Scanner(System.in);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("#"+(i+1)+"좋아하는 색깔 입력: ");
//			arr[i] = sc.nextLine();
//		}
//		
//		for(String str : arr) System.out.println(str);

///////////////////////////////////////////////////////////////////////////////////////

		// 피보나치
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("배열 크기 입력: ");
//		int size = sc.nextInt();
//
//		int[] fibo = new int[size];
//
//		for (int i = 0; i < fibo.length; i++) {
//			if (i == 0 || i == 1)
//				fibo[i] = i;
//			else
//				fibo[i] = fibo[i - 1] + fibo[i - 2];
//		}
//
//		for (int a : fibo)
//			System.out.println(a);

///////////////////////////////////////////////////////////////////////////////////////

		// 실습 시험 채점 프로그램

//		int[] right = {1,4,2,4,3};
//		int[] answer = new int[5];
//		int total = 100;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("답안 제출");
//		
//		for(int i = 0; i < answer.length; i++) {
//			System.out.print("#" + (i+1) + "번 문제 답안: ");
//			answer[i] = sc.nextInt();
//		}
//		
//		for(int i = 0 ; i < right.length; i++) {
//			System.out.print("#" + (i+1) + "번 정답: " + right[i] + " #" + (i+1) + "번 대답: " + answer[i]);
//			if(answer[i] != right[i]) 
//				total -= 20;
//			else
//				System.out.print(" 20");
//			System.out.println();
//		}
//		
//		System.out.println("점수는  " + total + "점 입니다.");

///////////////////////////////////////////////////////////////////////////////////////

//		int[] right =  {1, 4, 2, 4, 3};
//		int[] answer = {1, 4, 2, 1, 1};
//		
//		int score = 0;
//		
//		for(int i = 0; i < right.length; i++) {
//			if(right[i] == answer[i]) {
//				System.out.println(i+1 + "맞음");
//				score += 100/right.length;
//			}
//		}
//		System.out.println("점수: " + score);

///////////////////////////////////////////////////////////////////////////////////////

		// 실습) 최대값 출력
//		int[] arr = { 4, 6, 7, 2, 5 };
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값은 " + max);

//		int[] arr = { 4, 6, 7, 2, 5 };
//		int max = 0; //양수라는 가정하에
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값은 " + max);

		// 실습) 최솟값 출력
//		int[] arr = { 4, 6, 7, 2, 5 };
//		int min = arr[0];
//		
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("최소값은 " + min);

		// 실습) 선택정렬
//		int[] arr = { 4, 6, 7, 2, 5 };
//		int tmp, min;
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			min = i;
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[j] < arr[min]) {
//					min = j;
//				}
//				
//			}
//			tmp = arr[min];
//			arr[min] = arr[i];
//			arr[i] = tmp;
//		}
//		for (int a : arr)
//			System.out.println(a);

		// 버블 정렬
//		int[] arr = { 4, 6, 7, 2, 5 };
//		int tmp;
//		
//		for(int i = arr.length-1; i > 0 ; i--) {
//			
//			for(int j = 0; j < i; j++) {
//				if(arr[j] > arr[j+1]) {
//			
//					tmp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = tmp;
//					
//				}
//				
//			}
//			
//		}
//		for (int a : arr)
//			System.out.println(a);

		// 실습) 로또 번호 맞춘 갯수 출력, 로또 번호 랜덤 생성
//		
//		int[] no = {5, 45, 27, 2, 37, 44};
//		int[] lotto = new int[6];
//		int cnt = 0;
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45+1);
//			for(int j = 0; j < i; j++) { // 중복 방지
//				if(lotto[j] == lotto[i]) 
//					i--;
//			}
//		}
//		//1, 6, 7, 8, 9, 10
//		//1, 2, 3, 4, 5, 6
//		
//		
//		for(int i = 0; i < no.length; i++) {
//			for(int j = 0; j < no.length; j++) {
//				if(no[i] == lotto[j]) {
//					cnt++;
//					break;
//				}
//			}
//		}
//
//		System.out.println("맞춘 갯수는 "+ cnt);
//		
//		for(int a : lotto) System.out.println(a);
		// 얕은 복사 주소만 복사
//		int[] src = {1, 2, 3, 4, 5};
//		int[] dest = src; 
//		
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		src[1] = 20; dest[3] = 40;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));

		// 깊은 복사: 값을 복사
//		int[] src = {1, 2, 3, 4, 5};
//		int[] dest = new int[6];
//		
//		System.out.println("src:  " + Arrays.toString(src));
//		System.out.println("dest: " + Arrays.toString(dest));
//		
//		for(int i = 0; i < src.length; i++) {
//			dest[i] = src[i];
//		}
//		dest[5] = 6;
//		System.out.println("src:  " + Arrays.toString(src));
//		System.out.println("dest: " + Arrays.toString(dest));
//		src = dest;
//		System.out.println("src:  " + Arrays.toString(src));
//		System.out.println("dest: " + Arrays.toString(dest));
//		//프레임 워크를 이용한 데이터 복사
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);

		// 배열의 깊은 ㅂ고사
		int[] src = { 1, 2, 3, 4, 5 };
		int[] dest = { 0, 0, 0, 0, 0 };
		System.arraycopy(src, 2, dest, 0, 3);
		System.out.println(Arrays.toString(dest));
	}

}
