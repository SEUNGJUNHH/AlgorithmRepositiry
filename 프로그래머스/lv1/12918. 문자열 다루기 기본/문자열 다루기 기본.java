class Solution {
            public boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        if(s.length()==4||s.length()==6){
        for (char aChar : chars) {
            if(aChar<'0'||aChar>'9'){
                answer=false;
            }
        }
        }else answer=false;
        return answer;
    }

}