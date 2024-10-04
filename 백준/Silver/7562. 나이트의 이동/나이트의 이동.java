import java.io.*;
import java.util.*;

public class Main {
    //xy 순서
    static int[][] arr = {{2, 1}, {1, 2}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //testcase num
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            //체스판 한변의 길이 - 정사각형
            int l = Integer.parseInt(st.nextToken());
            boolean[][] check = new boolean[l][l];
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int goalX = Integer.parseInt(st.nextToken());
            int goalY = Integer.parseInt(st.nextToken());
            int answer = bfs(x, y, goalX, goalY, check, 0);
            System.out.println(answer);
        }

    }

    static int bfs(int nowX, int nowY, int goalX, int goalY, boolean[][] check, int sum) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{nowX, nowY, 0});
        check[nowY][nowX] = true;
        // 목표 위치와 현재 위치가 같을 경우 바로 0 반환
        if (nowX == goalX && nowY == goalY) return 0;
        while (!queue.isEmpty()) {
            int[] a = queue.poll();
            for (int i = 0; i < arr.length; i++) {
                int sumX = a[0] + arr[i][0];
                int sumY = a[1] + arr[i][1];
                if (sumX < check.length && sumY < check.length && sumX >= 0 && sumY >= 0) {
                    if (!check[sumY][sumX]) {
                        if (sumX == goalX && sumY == goalY) {
                            return a[2] + 1;
                        }
                        check[sumY][sumX] = true;
                        queue.add(new int[]{sumX, sumY, a[2] + 1});
                    }
                }
            }
        }
        return 0;
    }
}












