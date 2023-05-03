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
    static char[][] cosmap;
    static boolean[][] check;
    static int[] movex ={0,1,-1,0};
    static int[] movey = {-1, 0, 0, 1};

    public int solution(String[] maps) {
        int answer = 0;
        cosmap=new char[maps.length][maps[0].length()];
        check = new boolean[maps.length][maps[0].length()];
        XY start = null;
        XY lever = null;
        XY end = null;
        //시작점, 종료지점, 레버위치 설정 후 String 배열 2차원 char배열로 변경
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if(maps[i].charAt(j)=='S') start=new XY(i,j,0);
                else if (maps[i].charAt(j)=='L') lever = new XY(i, j, 0);
                else if (maps[i].charAt(j)=='E') end = new XY(i, j, 0);
                 cosmap[i][j] = maps[i].charAt(j);
                    System.out.print(cosmap[i][j]);
            }
        }
            //레버부터 찾기
            XY bfs = bfs(start.x, start.y, lever.x, lever.y, cosmap.length, cosmap[0].length);
            if(bfs==null) {answer= -1; return answer;}
            check = new boolean[cosmap.length][cosmap[0].length]; //전역변수임으로 여기서 초기화
            XY bfs1 = bfs(bfs.x, bfs.y, end.x, end.y, cosmap.length, cosmap[0].length);
            if(bfs1==null){answer= -1; return answer;}
            answer = bfs.distance+bfs1.distance;

        return answer;
    }

    private XY bfs(int startX,int startY,int endX,int endY,int row, int column) {
        Queue<XY> q = new LinkedList<>();
        q.add(new XY(startX, startY, 0));

        while (!q.isEmpty()) {
            XY now = q.poll();
            check[now.x][now.y]=true;
            if(now.x==endX&&now.y==endY)
                return now;
            for (int i = 0; i < 4; i++) {
                int currX = now.x + movex[i];
                int currY = now.y + movey[i];
                if(currY<0||currY>=column||currX<0||currX>=row) continue;
                if(!check[currX][currY]&&cosmap[currX][currY]!='X'){
                    q.add(new XY(currX,currY, now.distance+1));
                    check[currX][currY]=true;
                }
            }
        }

        return null;
        }
    }
