import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            que.add(i);
        }
        int check = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (!que.isEmpty()){
            check++;
            if(check==m){
                list.add(que.poll());
                check=0;
            }else{
                que.add(que.poll());
            }
        }
        System.out.print("<");
        for (int i = 0; i < n-1; i++) {
            System.out.print(list.get(i)+", ");
        }
        System.out.print(list.get(n-1)+">");
        br.close();
    }


}
