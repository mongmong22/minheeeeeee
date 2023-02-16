package SWEA;

import java.util.Scanner;

public class Solution_1204 {
	public static void main(String[] args) {
		// TODO : 최빈수 구하기
		// TC 주어짐./ 학생 수 1000명(반복횟수) / 점수는 0~100점(인덱스)
		// 길이 101의 배열 arr을 만들어 점수에 해당하는 인덱스 ++
		// 다 끝난 후 반복문 돌려 arr 중 최댓값의 인덱스 추출. (앞에서 뒤로 돌 것. >= 으로)

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int TC = sc.nextInt();

		for (int t = 0; t < TC; t++) {
			int[] arr = new int[101]; // 인덱스가 100번까지 있어야 하니까
			int tc = sc.nextInt();
			for (int i = 0; i < 1000; i++) {
				int score = sc.nextInt();
				arr[score]++;
			}

			// 배열에서 빈도 수 출력하기
			int max = 0;
			int maxidx = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= max) { // 빈도수가 같은 경우도 포함 (더 뒤에 인덱스를 읽도록 함)
					max = arr[i];
					maxidx = i;
				}
			}

			sb.append("#" + tc + " " + maxidx + "\n");

		} // TC만큼 for문 반복

		System.out.println(sb);
	}
}
