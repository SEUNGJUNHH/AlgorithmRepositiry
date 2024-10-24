import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] check;
    static int[][] arr = {{0,1},{1,0},{0,-1},{-1,0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        check = new boolean[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j]==1 && check[i][j]==false){
                    int a =bfs(j, i);
                    list.add(a);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        check[y][x] = true;
        int count = 1;
        while (!queue.isEmpty()){
            int[] a = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = a[0] + arr[i][0];
                int newY = a[1] + arr[i][1];
                if(newX>=0&&newX<map.length&&newY>=0&&newY<map.length){
                    if(!check[newY][newX]&&map[newY][newX]==1){
                        queue.add(new int[]{newX,newY});
                        check[newY][newX] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}