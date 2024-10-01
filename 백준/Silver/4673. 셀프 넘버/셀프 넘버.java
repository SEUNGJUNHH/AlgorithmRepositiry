import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final int MAX = 10000; // 상수로 최대 값 정의
        boolean[] arr = new boolean[MAX + 1]; // 1부터 10000까지 배열 생성

        // 1부터 MAX까지 각 숫자의 셀프 넘버 여부 판단
        for (int i = 1; i <= MAX; i++) {
            int generator = getGenerator(i); // 생성자 값 계산
            if (generator <= MAX) arr[generator] = true; // 배열에 표시
        }

        // 셀프 넘버 출력 (arr[i]가 false인 경우)
        for (int i = 1; i <= MAX; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }

    // d(n)을 계산하는 함수
    public static int getGenerator(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10; // 마지막 자리수 더하기
            n /= 10; // 다음 자리수로 이동
        }
        return sum;
    }
}