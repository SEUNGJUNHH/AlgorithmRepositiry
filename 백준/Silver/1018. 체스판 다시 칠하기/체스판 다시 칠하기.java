import java.io.*;
import java.util.*;

public class Main {
    static String[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//세로
        int m = Integer.parseInt(st.nextToken());//가로
        int answer = Integer.MAX_VALUE;
        arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }
        for (int i = 0; 8 <= arr.length-i; i++) { //y
            for (int j = 0; 8 <= arr[0].length-j; j++) { //x
                int a = calcul(i,j);
                answer = Math.min(answer,a);
            }
        }
        System.out.println(answer);
    }
    static int calcul(int startX, int startY) {
        String[] colors = {"W", "B"}; // 체스판의 두 가지 색
        int minCount = Integer.MAX_VALUE; // 최소 변경 개수

        // 두 가지 패턴을 모두 체크 (W로 시작하는 경우, B로 시작하는 경우)
        for (int k = 0; k < 2; k++) {
            int count = 0;
            // 8x8 체스판 체크
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    // 시작 색과 교차하면서 색칠
                    if (!arr[startX + i][startY + j].equals(colors[(i + j + k) % 2])) {
                        count++; // 색이 맞지 않는 경우 카운트 증가
                    }
                }
            }
            // 최소값 갱신
            minCount = Math.min(minCount, count);
        }
        return minCount;
    }
}