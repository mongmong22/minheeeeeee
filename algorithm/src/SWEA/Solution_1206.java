package SWEA;

import java.util.Scanner;

public class Solution_1206 {
	public static void main(String[] args) {
		// TODO : 조망권이 있는 세대 수 구하기 (양 옆으로 2칸이 비어있어야 함)
		// 1이라면 좌,우 2칸 탐색 -> 좌우 2칸이 모두 비어있으면 세대 수 + 1
		// 1. 앞에 두개보다 높고, 뒤에 2개보다 높으면 -> 조망권 있음
		// 2. 조망권 있는 세대의 수는 내 건물 층 수 - 앞 뒤 건물 숫자 중 높은거

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

//		int TC = sc.nextInt(); // TC : 테스트케이스 수 -> 주어짐 10번
		int temp = 0;		
		int viewpoint = 0;		//조망권 있는 세대 


		for (int t = 0; t < 10; t++) {
			int N = sc.nextInt(); // N : 건물 수
			int[] arr = new int[N]; // 건물의 층을 넣은 배열
			
			for (int i = 0; i < N; i++) { // arr에 초기값 집어넣기 (주어진 수)
				arr[i] = sc.nextInt();
			}
			
			for(int i=2; i<arr.length-2; i++ ) {
				if(arr[i-2]<arr[i] && arr[i-1]<arr[i]) {	// 앞에 두 칸이 나보다 낮고, 뒤에 두칸도 나보다 낮으면, 
					if(arr[i+2]<arr[i] && arr[i+1]<arr[i]) {// 그 4개중에 큰 값을 빼기
						int target = Math.max(Math.max(arr[i+2], arr[i+1]),Math.max(arr[i-2], arr[i-1]));
						int view = arr[i] - target;
						viewpoint += view;
					}
				}
			}
			sb.append("#"+(t+1)+" "+viewpoint+"\n");
			viewpoint =0;		//다음 케이스에선 재계산 해야하므로 0
		}//TC에 대한 for문
		System.out.println(sb);
	}
}
