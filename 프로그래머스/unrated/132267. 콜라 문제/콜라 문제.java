class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
      while (true) {
           int saver = 0;
            int num = 0;
            saver = (n / a) * b;
            answer += saver;
            num = n % a;
            n = num + saver;
            if (n < a) {
                break;
            }
        }
        return answer;
    }
}