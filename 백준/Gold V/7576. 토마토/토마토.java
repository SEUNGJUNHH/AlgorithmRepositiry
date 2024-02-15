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
    static int[][] xyNum = {{1,0},{-1,0},{0,1},{0,-1}};
    static boolean[][] check ;
    static int[][] arr;
    static int answer =0;
     static Queue<XY> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //가로
        int n = Integer.parseInt(st.nextToken());
        //세로
        int m = Integer.parseInt(st.nextToken());
        check  = new boolean[m][n];
        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1) {
                    check[i][j]=true;
                    queue.add(new XY(j,i));
                }
            }
        }
        bfs(queue);
        if(answer==1) System.out.println(0);
        else{
            for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0) answer = -1;
            }
        }
         if(answer!=-1)   System.out.println(answer-1);
         else System.out.println(answer);
        }

        br.close();
    }

    public static void bfs( Queue<XY> queue){
        if(queue.isEmpty()) return;
        Queue<XY> queue1 = new LinkedList<>();
        while (!queue.isEmpty()){
            XY xy = queue.poll();
            for (int i = 0; i < xyNum.length; i++) {
                int xNum = xy.x+ xyNum[i][0];
                int yNum = xy.y+ xyNum[i][1];
                if(xNum>=0&&xNum<arr[0].length&&yNum>=0&&yNum<arr.length){
                    if(check[yNum][xNum]==false&&arr[yNum][xNum]==0){
                        queue1.add(new XY(xNum,yNum));
                        check[yNum][xNum]=true;
                        arr[yNum][xNum] =1;
                    }
                }
            }
        }
        answer++;
        bfs(queue1);
    }

}
