import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(!(list.contains(sum))){
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
}