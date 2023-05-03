import java.util.LinkedList;
import java.util.Queue;

class Solution {
       // 좌표를 위한 클래스 생성
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

        static boolean[][] check;
        static char[][] mymap;
        static int[] xnum = {1,-1,0,0};
        static int[] ynum = {0, 0, 1, -1};

    public int solution(String[] maps) {
        int answer = 0;
        mymap = new char[maps.length][maps[0].length()];
        check = new boolean[maps.length][maps[0].length()];
        XY startXy = null;
        XY endXY = null;
        XY leverXY = null;
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if(maps[i].charAt(j)=='L') leverXY = new XY(i, j, 0);
                else if (maps[i].charAt(j)=='S') startXy = new XY(i, j, 0);
                else if(maps[i].charAt(j)=='E') endXY = new XY(i, j, 0);
                mymap[i][j] = maps[i].charAt(j);
            }
        }
        XY bfs = bfs(startXy, leverXY, maps.length, maps[0].length());
        if(bfs==null){return -1;}
        check = new boolean[maps.length][maps[0].length()];
        XY bfs1 = bfs(bfs, endXY, maps.length, maps[0].length());
        if(bfs1==null){return -1;}
        return bfs1.distance;
    }

    private XY bfs(XY start, XY end ,int row, int column) {
        Queue<XY> q = new LinkedList<>();
        q.add(start);
        check[start.x][start.y] =true;
        while(!q.isEmpty()){
            XY now = q.poll();
            check[now.x][now.y]=true;
            if(now.x== end.x&&now.y== end.y) return now;
            for (int i = 0; i < 4; i++) {
               int nowx = now.x+xnum[i];
               int nowy = now.y + ynum[i];
                if(nowx<0||nowy<0||nowx>=row||nowy>=column) continue;
                if(!check[nowx][nowy]&&mymap[nowx][nowy]!='X'){
                    q.add(new XY(nowx,nowy,now.distance+1));
                    check[nowx][nowy] = true;
                }
            }
        }
        return null;
    }
}