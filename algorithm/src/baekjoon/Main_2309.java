package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {

	public static void main(String[] args) {
		// TODO 일곱난쟁이
		// 주어진 9개의 수 중에 7개를 조합하여 다 합쳤을 떄 값이 100이면 해당 원소들(7개) 출력

		Scanner sc = new Scanner(System.in);

		// 난쟁이 수 9개 배열 생성 하면서 9명의 합계를 구한다.
		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		// 가짜 두명 찾기
		int[] fake = new int[2];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i != j) {
					int newsum = sum - arr[i] - arr[j];
					if (newsum == 100) {
						fake[0] = arr[i];
						fake[1] = arr[j];
					}
				}
			}
		}
		// 나머지 인원 배열에 넣기
		int[] real = new int[7];
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			if (arr[i] == fake[0] || arr[i] == fake[1]) {
				continue;
			} else {
				real[idx++] = arr[i];
			}
		}

		// real배열을 오름차순으로 정렬
		for (int i = 0; i < 7; i++) {
			int minidx = i;
			for (int k = i+1; k < 7; k++) {
				if (real[minidx] > real[k]) {
					minidx = k;
				}
			}
			int temp = real[i];
			real[i] = real[minidx];
			real[minidx] = temp;
		}

		for(int e : real) {
			System.out.println(e);
		}

	}

}
