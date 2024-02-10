import java.io.*;
import java.util.*;


public class Main {
    static class XY{
        int x;
        int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[][] xyNum = {{1,0},{0,1},{-1,0},{0,-1}};
    static ArrayList<Integer> list = new ArrayList<>();
    static int[][] arr;
    static boolean[][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        check = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
               arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(check[i][j]==false&&arr[i][j]==1){
                    check[i][j] = true;
                    bfs(j,i);
                }
            }
        }
        if(list.size()==0){
            System.out.println(0);
            System.out.println(0);
        }else{Collections.sort(list,Collections.reverseOrder());
            System.out.println(list.size());
            System.out.println(list.get(0));}

        br.close();
    }
    public static void bfs(int x, int y){
        Queue<XY> queue = new LinkedList<>();
        int count = 0;
        queue.add(new XY(x,y));
        while (!queue.isEmpty()){
            XY xy = queue.poll();
            count++;
            for (int i = 0; i < xyNum.length; i++) {
                 int xNum = xy.x+xyNum[i][0];
                 int yNum = xy.y+xyNum[i][1];
                 if(xNum>=0&&xNum<arr[0].length&&yNum>=0&&yNum< arr.length){
                     if(check[yNum][xNum]==false&&arr[yNum][xNum]==1){
                     check[yNum][xNum]=true;
                     queue.add(new XY(xNum,yNum));
                 }
                 }
            }
        }
        list.add(count);
    }


}
