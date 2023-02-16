package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1208 {
	public static void main(String[] args) {
		// TODO : 덤프횟수가 정해진 상태에서 죄대한 평탄화 하기
		// 가로길이 100 세로길이 100제한
		// 주어진 배열에서 최댓값을 구하고 최솟값을 구함
		// 최댓값 -1 / 최솟값 +1 / 덤프 횟수 +1
		// -> 다시 최댓값과 최솟값을 구함.
		// 반복은 주어진 덤프 횟수 미만이어야 하며 덤프 횟수에 도달하는 경우 최댓값과 최솟값의 차를 반환
		// 최댓값과 최솟값의 차이가 0 또는 1 이 되는 경우 (차이) 반환하고 끝 -> 반복문 아래 if로 걸기

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		first : for (int t = 0; t < 10; t++) {

			int N = sc.nextInt(); // 제한된 덤프 수 (주어진 수)
			int[] arr = new int[100];		//길이가 100인 배열 생성(건물이 총 100개)
			
			for (int i = 0; i < 100; i++) { // arr에 초기값 집어넣기 (주어진 수)
				arr[i] = sc.nextInt();
			}

			int maxidx = 0;
			int minidx = 0;
			int dump = 0;
						
			while (dump < N) {
				int max = 0;
				int min = 101;
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > max) { // 최댓값찾기
						max = arr[i];
						maxidx = i;
					}
					if (arr[i] < min) { // 최솟값찾기
						min = arr[i];
						minidx = i;
					}
				} // 최댓값 찾는 for문 종료
				
				if ((arr[maxidx] - arr[minidx]) <= 1) {		//처음 혹은 중간에 평탄화가 된 경우.
					break;
				} 

				arr[maxidx]--; // 해당 인덱스 값 -1
				arr[minidx]++; // 해당 인덱스 값 +1
				dump++;		// 덤프 횟수 +1
				
			}
			// 한번 더 최대 최솟값을 구해주는 작업 필요.
			int min = 101;
            int max = 0;
            for (int i = 0; i < 100; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    maxidx = i;
                } else if (arr[i] <= min) {
                    min = arr[i];
                    minidx = i;
                }
			                   
            }

			sb.append("#" + (t + 1) + " " + (arr[maxidx] - arr[minidx]) + "\n");	// 평탄화가 안되고 끝난 경우

		} // TC에 대한 for문
		System.out.println(sb);
	}
}