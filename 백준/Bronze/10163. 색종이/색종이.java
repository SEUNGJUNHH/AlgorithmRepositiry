import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] check = new int[1001][1001];
        int n = Integer.parseInt(st.nextToken());
        int count =0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    check[y+j][x+k] = i;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            int answer =0;
            for (int j = 0; j < 1001; j++) {
                for (int k = 0; k < 1001; k++) {
                    if(check[j][k]==i) answer++;

                }
            }
            System.out.println(answer);
        }


    }
}