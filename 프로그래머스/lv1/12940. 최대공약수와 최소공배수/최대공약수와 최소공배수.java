class Solution {

    public int[] solution(int n, int m) {
        int[] answer={0,0};
        boolean flag = false;
        int a;
        if(n>m) a=m;
        else a=n;
        for (int i = 1; i <= m*n; i++) {
            if(n%i==0&&m%i==0) {
                if(answer[0]<i){answer[0]=i;}}
            if(i%n==0&&i%m==0&&flag==false)
            {answer[1]=i;
            flag=true;}
        }
        return answer;
    }
}