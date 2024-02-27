import java.io.*;
import java.util.*;


public class Main {
    static class XY{
        int x;
        int y;
        XY(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        XY[] xy = new XY[n];
        boolean[][] check = new boolean[100][100];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xy[i] = new XY(x,y);
        }
        for (int i = 0; i < n; i++) {
            int x  = xy[i].x;
            int y  = xy[i].y;
            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    check[j][k] = true;
                }
            }
        }
        int answer = 0;
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if(check[j][k]){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        br.close();
    }



}
