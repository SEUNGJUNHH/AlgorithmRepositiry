import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 1000000; i++) {
            int number = i;
            int answer = i;
            while (number > 0) {
                int digit = number % 10; // 마지막 자리수 추출
                answer+=digit;
                number /= 10; // 숫자를 10으로 나눠 다음 자리수로 이동
            }
            if(answer == num) {
                System.out.print(i);
                break;
            }
            if(num<=i) {
                System.out.print(0);
                break;
            }
        }
    }
}