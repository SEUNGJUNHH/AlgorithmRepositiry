import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[10001];
        for (int i = 1; i < arr.length; i++) {
            int number = i;
            int answer = i;
            while (number > 0) {
                int digit = number % 10; // 마지막 자리수 추출
                answer+=digit;
                number /= 10; // 숫자를 10으로 나눠 다음 자리수로 이동
            }
            if(answer<=10000) arr[answer] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(!arr[i]) System.out.println(i);
        }
    }
}