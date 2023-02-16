package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {

	public static void main(String[] args) throws IOException {
		// TODO 괄호가 쌍이 맞는지 확인하기

		// TC 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		int playing = 1; // 중간에 멈췄으면 밑에 if문 실행안하도록.

		// '(' 면 stack에 한글자씩 넣고 ')'면 하나씩 빼서 확인.
		for (int i = 0; i < TC; i++) { // 케이스 수 만큼 반복
			String str = br.readLine();
			// 괄호를 넣을 stack을 설정한 뒤
			Stack<Character> checkVPS = new Stack<>();
			playing = 1;
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == '(') {
					checkVPS.push(str.charAt(k));
				} else if (str.charAt(k) == ')') {
					if (checkVPS.isEmpty()) { // 이미 stack이 비었으면 더 이상 빼낼 것이 없으므로 짝이 안맞는 것.
						playing = 0;
						break;
					}
					checkVPS.pop();
				}
			} // for 괄호 넣고 빼기
			if (checkVPS.isEmpty() && (playing == 1)) {
				System.out.println("YES");
			} // stack이 비었으면 쌍이 맞음
			else {
				System.out.println("NO");
			} // stack에 남아있는것이 있는 경우

		} //

	}

}
