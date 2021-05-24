package basic01;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열
		// 선언과 동시에 초기화시 배열의 크기는 안씀
//		int[][] arr = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		// 생성자 생략 가능
//		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.printf("%2d ", arr[i][j] );
//			}
//			System.out.println();
//		}
//		for(int[] a: arr) {
//			for(int b: a)
//			System.out.println(b);
//		}

		//
//		int[][] arr = new int[3][4];
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (4*i+j)+1;
//				
//			}
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.printf("%2d\t", j);
//			}
//			System.out.println();
//		}


		int[][] arr = new int[5][5];
		int n = 0;
		int s = 1;
		int x = 0, y = 0;
		for(y = 0; y < 5; y++) {
			arr[x][y] = ++n;
		}
		y--;
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				x += s;
				arr[x][y] = ++n;
			}
			s *= -1;
			for(int j = 0; j < i; j++) {
				y += s;
				arr[x][y] = ++n;
			}
		 
			
			
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println(); 
		}
	}

}
