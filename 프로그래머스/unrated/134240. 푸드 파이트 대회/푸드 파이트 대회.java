import java.util.ArrayList;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num=0;
        int size = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(int i =1;i< food.length;i++){
            num = food[i] / 2;
            for(int j=0;j<num;j++){
                arr.add(String.valueOf(i));
            }
        }
        arr.add(String.valueOf(0));
        size=arr.size()-2;
        for(;size>=0;size--){
            arr.add(arr.get(size));
        }

        answer = String.join("", arr);
        
        return answer;
    }
}