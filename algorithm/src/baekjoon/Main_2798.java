package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {

	public static void main(String[] args) throws IOException{
		// TODO : 블랙잭
		// N장의 카드를 숫자가 보이도록 놓는다
		// 3장의 합이 제시된 숫자 M과 가장 가깝도록 한다(합이 M을 넘으면 안된다)
		// 카드의 합을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());

		//오픈된 카드를 넣을 배열을 만들고 for문으로 값 넣기
		int[] arr = new int[N];	
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int opennum = Integer.parseInt(st2.nextToken());
			arr[i] = opennum;
		}
		
		int sum = 0;		//최종 3장의 합계
		
		//for문 돌면서 3개의 수 조합만들기
		for (int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {					//첫번째 숫자 지정 후 다음 숫자부터 탐색 할거니까 i+1부터 시작
				for(int k=j+1; k<N; k++) {
					int temp = arr[i]+arr[j]+arr[k];	//새로운 조합으로 더해진 숫자
					if(temp > M) continue;				//만약에 temp가 M을 넘으면 다음 케이스 탐색 
					if(sum < temp) {
						sum = temp;						// 새로운 합계가 sum보다 크다면 sum을 해당 값으로 바꿈.
					}
				}
			}
		}
		System.out.println(sum);
				
	}

}
