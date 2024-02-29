import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n  = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            if(num.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if (num.equals("pop")) {
                if(!stack.isEmpty()){
                    sb.append(stack.pop()).append('\n');
                }else sb.append(-1).append('\n');
            }else if (num.equals("size")) {
                sb.append(stack.size()).append('\n');
            }else if (num.equals("empty")) {
                if(stack.isEmpty()){
                    sb.append(1).append('\n');
                }else sb.append(0).append('\n');
            }else if (num.equals("top")) {
                if(!stack.isEmpty()){
                    sb.append(stack.peek()).append('\n');
                }else sb.append(-1).append('\n');
            }
        }

        System.out.print(sb);

        //index는 1부터
        br.close();
    }


}
