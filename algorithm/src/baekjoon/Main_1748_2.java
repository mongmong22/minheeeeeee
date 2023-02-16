package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1748_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1; //자릿수 카운트
		int ten = 10; //자리수 밑수
		int result = 0; // 이어붙인수의 자릿수
		
		for(int i=1; i<=N; i++) {
			if( i == ten) {
				cnt++;		//자리수가 증가함
				ten = ten * 10;
			}
			result +=cnt;
		}
		System.out.println(result);


	}

}
