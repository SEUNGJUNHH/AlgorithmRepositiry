import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] check;
    static int[][] arr = {{0,1},{0,-1},{1,0},{-1,0}};
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //y
        int m = Integer.parseInt(st.nextToken());
        //x
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        check = new boolean[m][n];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int firX = Integer.parseInt(st.nextToken());
            int firY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            for (int j = firX; j < endX; j++) {
                for (int l = firY; l < endY; l++) {
                    check[l][j] = true;
                }
            }
        }
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if(!check[j][l]){
                        check[j][l]= true;
                        count++;
                        bfs(l,j);
                        list.add(count);
                        count = 0;
                        answer+=1;
                    }
                }
            }


        System.out.println(answer);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    static void bfs (int x, int y){
        for (int i = 0; i < arr.length; i++) {
            int pathX = x+arr[i][0];
            int pathY = y+arr[i][1];
            if(pathX>=0&&pathX<check[0].length&&pathY>=0&&pathY<check.length){
                if(!check[pathY][pathX]){
                    check[pathY][pathX] = true;
                    count++;
                    bfs(pathX,pathY);
                }
            }

        }
    }
}