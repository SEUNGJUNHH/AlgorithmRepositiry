class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        //photo.length는 row갯수를 의미한다
        for (int i = 0; i < photo.length; i++) {
            //photo[j].length는 row에 속한 column값을 의미한다.
            for (int j = 0; j < photo[i].length; j++) {
                String test = photo[i][j];
                for (int k = 0; k < name.length; k++) {
                   if(name[k].equals(test)) answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }
}