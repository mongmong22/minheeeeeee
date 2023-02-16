package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_7568 {

	public static void main(String[] args) throws IOException {
		// TODO : N명이 주어질 때 덩치를 비교해서 각자의 등수를 출력하자.(공동 등수 존재)
		// 덩치 = (몸무게, 키)
		// 두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)
		// 몸무게와 덩치가 더 큰경우만 덩치가 더 크다라고 함. -> 그 외의 경우 판단 불가.
		// 자신보다 정치가 큰 사람의 수 + 1이 자신의 등수. (공동 등수 존재)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 주어진 사람의 수

		// 1. 각 몸무게와 키를 길이 2의 배열로 한 다음. -> 길이가 N인 배열에 넣음 (이중배열)
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 2. 결과를 담을 배열
		int[] result = new int[N]; // 결과를 담을 배열(사람 수 만큼)

		// i번째 사람과 j번째 사람과 비교하기 -> 덩치가 크면 결과 배열에 +1(i번째사람)
		for (int i = 0; i < N; i++) {
			result[i] = 1; // 결과배열의 인덱스마다 초기값 1로 설정
			for (int j = 0; j < N; j++) { // !!!이렇게 하면 자기 자신과도 비교하겠지만, 같은 숫자는 안 더하니까 일단 패스.
				if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
					result[i]++; // 덩치가 큰 사람있으면 +1
				}
			}
		}

		// 3. 결과 배열 출력
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
