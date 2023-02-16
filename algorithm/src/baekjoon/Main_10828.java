package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828 {


	public static void main(String[] args) throws IOException {
		// TODO 명령어를 받아 처리하기

		// TC 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		Stack arr = new Stack();
		
		for(int i=0; i<TC; i++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			String str = tokens.nextToken();
			switch (str) {
			case "push": 
				arr.push(tokens.nextToken()); break;
			case "pop" : 
				if (arr.isEmpty() == true) {
					System.out.println(-1);
				} else {
					System.out.println(arr.pop());
				}break;
			case "size" :
				System.out.println(arr.size());break;
			case "empty" :
				if (arr.isEmpty() == true) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}break;
			case "top" :
				if (arr.isEmpty() == true) {
					System.out.println(-1);
				}else {
					System.out.println(arr.peek());	
				}break;			
			} //switch
	
		}//for
		
		
	} //main

}//class
