import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
     int answer =0;
        boolean check = false;
     for(int i =0 ; i<skill_trees.length;i++){
         String reSkill = skill_trees[i].replaceAll("[^+" + skill + "]","");
         System.out.print(reSkill + " ");
             for(int j =0 ; j<reSkill.length();j++){
                 if(skill.charAt(j)!=reSkill.charAt(j)) {
                     check = true;
                     break;
                 }
             }
         if(check==false) answer++;
        check = false;
     }
        
     return answer;
    }
}