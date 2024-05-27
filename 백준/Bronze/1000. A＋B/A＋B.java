import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int maxNum;
    static int minNum = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int num = Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());
        
        System.out.println(num+num1);
    }

}