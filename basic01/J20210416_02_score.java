package basic01;

import java.util.Scanner;

public class J20210416_02_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		int no;
		String[] sub = { "국어", "영어", "수학" };
		System.out.println("\t성적 관리 프로그램");
		System.out.println("------------------------------");
		do {
			System.out.println("1. 성적 등록");
			System.out.println("2. 학생별 합계/평균");
			System.out.println("3. 과목별 합계/평균");
			System.out.println("0. 종료");
			System.out.println("------------------------------");
			System.out.print("입력: ");

			no = sc.nextInt();
			switch (no) {

			case 1:
				for (int i = 0; i < arr.length; i++) {
					System.out.printf("%d번 학생 \n", i + 1);
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(String.format("%s: ", sub[j]));
						arr[i][j] = sc.nextInt();
					}
				}


				System.out.println("------------------------------");
				break;
			case 2:
				
//				 for(int i = 0; i < arr.length; i++) {
//				 sum = 0;
//				 for(int j = 0; j < arr[i].length; j++) {
//				 sum += arr[i][j];
//				 }
//				 avg = (double)sum/arr[i].length;
//				 //System.out.printf("%d번 학생 합계: %d\t평균: %.2f\n", i+1, sum,
//				 (double)sum/arr[i].length);
//				 System.out.println((i+1)+"번 학생 합계: " + sum + "\t평균: "+
//				 Math.round(avg*100)/100.0);
//				
//				 }
				
				// for each 이용한 출력

				int n = 0;
				for (int[] a : arr) {
					sum = 0;
					for (int b : a) {
						sum += b;
					}
					System.out.printf("%d 학생 합계: %d\t평균: %.2f\n", ++n, sum, (double) sum / a.length);
				}
				System.out.println("------------------------------");
				break;
				
			case 3:

				for (int i = 0; i < 3; i++) {
					sum = 0;
					for (int j = 0; j < 2; j++) {
						sum += arr[j][i];
					}
					System.out.printf("%s 합계: %d\t평균: %.2f\n", sub[i], sum, (double) sum / 3);
				}
				System.out.println("------------------------------");
				break;
			case 0:
				break;
			default:
				System.out.println("잘못된 입력");
				System.out.println("------------------------------");
				break;

			}
		} while (no != 0);
		System.out.println("프로그램을 종료합니다.");
	}

}
