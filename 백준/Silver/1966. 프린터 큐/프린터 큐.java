import java.io.*;
import java.util.*;

class XY{
    int X;
    int Y;

    public XY(int x, int y) {
        X = x;
        Y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n  = Integer.parseInt(br.readLine());
    Queue<XY> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalNum = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[totalNum];
            int targetNum = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < totalNum; j++) {
                int a = Integer.parseInt(st.nextToken());
                queue.add(new XY(a,j));
                arr[j] = a;
            }
            Arrays.sort(arr,Collections.reverseOrder());
            for (int j = 0; j < arr.length; j++) {
                while (!queue.isEmpty()){
                    XY xy = queue.poll();
                    if(xy.X==arr[j]){
                        if(xy.Y==targetNum){
                            sb.append(j+1).append('\n');
                            queue.clear();
                            break;
                        }
                        j++;
                    }else queue.add(xy);
                }
            }
            }
            System.out.print(sb);

    //index는 1부터
    br.close();
    }


}
