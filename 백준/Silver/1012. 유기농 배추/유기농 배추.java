import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] check;
    static int[][] path = {{0,1},{1,0},{0,-1},{-1,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //testcase num
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            int answer = 0;
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            check = new boolean[n][m];
            for (int j = 0; j <k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if(arr[j][l]==1&&!check[j][l]){
                        bfs(l,j);
                        answer +=1;
                    }
                }
            }
            System.out.println(answer);
        }

    }
    static void bfs(int x , int y){
        Queue<int[]> queue = new LinkedList<>();
        check[y][x]=true;
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for (int i = 0; i < path.length; i++) {
                int sumX = now[0] + path[i][0];
                int sumY = now[1] + path[i][1];
                if(sumX>=0 && sumX<arr[0].length && sumY>=0 && sumY<arr.length){
                    if(!check[sumY][sumX] && arr[sumY][sumX]==1){
                        queue.add(new int[]{sumX,sumY});
                        check[sumY][sumX] = true;
                    }
                }

            }
        }
    }


}












