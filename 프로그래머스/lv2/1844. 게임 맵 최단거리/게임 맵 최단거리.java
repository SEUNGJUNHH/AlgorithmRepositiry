import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class XY{
        int x;
        int y;
        int distance;
        public XY(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    boolean[][] check;
    int[]xx = {0,-1,1,0};
    int[]yy = {1,0,0,-1};
    //시작은 0,0 도착지 4,4
    public int solution(int[][] maps) {
        int answer = -1;
        check = new boolean[maps.length][maps[0].length];
        Queue<XY> q = new LinkedList<>();
        XY start = new XY(0,0,0);
        XY end = new XY(maps.length-1, maps[0].length-1,0);
        q.add(start);
        check[start.x][start.y] = true;
        while (!q.isEmpty()){
            XY now = q.poll();
            if(now.x==end.x&&now.y== end.y) return now.distance+1;
            for (int i = 0; i < 4; i++) {
                int nowx = now.x + xx[i];
                int nowy = now.y+yy[i];
                if(nowx<0||nowy<0||nowx> maps.length-1||nowy>maps[0].length-1)continue;
                if(maps[nowx][nowy]==1&&!(check[nowx][nowy])){
                    q.add(new XY(nowx,nowy,now.distance+1));
                    check[nowx][nowy] = true;
                }
            }


        }

        return answer;
    }
}