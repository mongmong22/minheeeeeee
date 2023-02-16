package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1209 {
	public static void main(String[] args) {
		// TODO : 2차원배열 내 합계구하기
		// 테스트케이스 10개
		// 100X100 사이즈 배열 생성 (arr)
		// for문 돌려서 합계 구하기 -> 가로/세로/대각선 -> 담을 배열 (sums)
		// sums중에 최댓값 구하기

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int[][] arr = new int[100][100]; // 100X100짜리 2차원배열 생성
		int[] sums = new int[202];

		for (int t = 1; t <= 10; t++) { // TC 10번 수행
			int tc = sc.nextInt();
			// 2차원배열 채우기
			for (int i = 0; i < 100; i++) { // 2차원배열 채우기
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			// 행, 열 합계구하기
			int idx = 0;
			for (int i = 0; i < 100; i++) {
				int colsum = 0; // 행의 합
				int rowsum = 0; // 열이 합
				for (int j = 0; j < 100; j++) {
					colsum += arr[i][j];
					rowsum += arr[j][i];
				}
				sums[idx++] = colsum;
				sums[idx++] = rowsum;
			}

			// 대각선 합 구하기
			int crosssum1 = 0;
			int crosssum2 = 0;
			int start1 = 0;
			int start2 = 99;
			for (int i = 0; i < 100; i++) {
				crosssum1 += arr[start1][start1];
				crosssum2 += arr[start1][start2];
				start1++;
				start2--;
			}
			sums[idx++] = crosssum1;
			sums[idx++] = crosssum2;
			
			// sums에서 최댓값 구하기
			int max = 0;
			for(int i=0; i<sums.length; i++) {
				if(sums[i]>max) {
					max = sums[i];
				}
			}
			sb.append("#"+tc+" "+max+"\n");

		} //TC번 수행 (전체 for문)
		System.out.println(sb);
	}

}
