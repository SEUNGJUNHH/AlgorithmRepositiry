import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();
    int answer = 0;
    int n = Integer.parseInt(br.readLine());
    for(int  i = 0 ; i<n;i++){
        int num =  Integer.parseInt(br.readLine());
        if(num==0){
            answer -= stack.pop();
        }else {
            stack.push(num);
            answer += num;
        }
    }
        System.out.println(answer);
    br.close();
    }


}
