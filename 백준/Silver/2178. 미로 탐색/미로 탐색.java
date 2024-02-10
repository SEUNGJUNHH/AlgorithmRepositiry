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
    static char[][] arr;
    static int[][] arr2;
    static boolean[][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        arr2 = new int[n][m];
        for (int i = 0; i < n; i++)
            Arrays.fill(arr2[i], 50000);
        check = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String sts = br.readLine();
            for (int j = 0; j < m; j++) {
               arr[i][j] = sts.charAt(j);
            }
        }
        check[0][0] =  true;
        arr2[0][0] = 1;
        bfs(0,0);
        if(arr2[n-1][m-1]==101){
            System.out.println(0);
        }else System.out.print(arr2[n-1][m-1]);

        br.close();
    }
    public static void bfs(int x, int y){
        Queue<XY> queue = new LinkedList<>();
        queue.add(new XY(x,y));
        while(!queue.isEmpty()){
            XY xy =  queue.poll();

            for (int i = 0; i < xyNum.length; i++) {
                int xNum = xy.x+xyNum[i][0];
                int yNum = xy.y+xyNum[i][1];
                if(xNum>=0&&xNum<arr[0].length&&yNum>=0&&yNum< arr.length){
                    if(check[yNum][xNum]==false&&arr[yNum][xNum]=='1'){
                        queue.add(new XY(xNum,yNum));
                        arr2[yNum][xNum]=Math.min(arr2[xy.y][xy.x]+1,arr2[yNum][xNum]);
                        check[yNum][xNum]= true;
                    }
                }
            }
        }
    }


}
