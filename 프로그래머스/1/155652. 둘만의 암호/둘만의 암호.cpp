#include <string>
#include <unordered_set>

using namespace std;

string solution(string s, string skip, int index) {

    unordered_set<char> skipSet(skip.begin(), skip.end());

    for (int i = 0; i < s.size(); i++) {
        int moveCount = 0; 

        while (moveCount < index) {
            s[i]++; 

            if (s[i] > 'z') {
                s[i] = 'a';
            }

            if (skipSet.find(s[i]) != skipSet.end()) {
                continue;
            }

            moveCount++;
        }
    }

    return s;
}