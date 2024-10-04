#include <string>
#include <vector>
#include <algorithm>

using namespace std;
bool compare (int a, int b){
    return a>b;
}
string solution(string s) {
    vector<char> arr;
    for(int i = 0; i< s.size(); i++){
        arr.push_back(s[i]); 
    }
    sort(arr.begin(), arr.end(), compare);
    string answer(arr.begin(), arr.end());
    return answer;
}