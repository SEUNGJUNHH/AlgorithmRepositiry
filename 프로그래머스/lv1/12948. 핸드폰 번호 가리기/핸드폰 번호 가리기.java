class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < phone_number.length(); i++) {
            if(phone_number.length()-4>i) chars[i] = '*';
            answer += chars[i];
        }
        return answer;
    }


}