package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6603 {
    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[] result;
    static StringBuilder sb = new StringBuilder();		//아래 함수에서도 쓰기 위해서는 main 밖에 선언. 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            if (n == 0)			//마지막 입력줄의 경우 멈추기
                break;

            arr = new int[n];		//
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            result = new int[6];		//결과를 담을 배열
            visit = new boolean[n];
            back(0, 0);

            System.out.println(sb);

        }

    }

    static void back(int start, int depth) {
        if (depth == 6) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                back(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}