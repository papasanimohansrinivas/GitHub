#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>

using namespace std;

string u;

bool contains(char t);
int main(){
    int Q;
    cin >> Q;
    vector<string> output;
    for(int a0 = 0; a0 < Q; a0++){
        int n;
        cin >> n;
        string b;
        cin >> b;
        u=b;
        //cout << b << endl;
        vector <int> answer;
        string h;
        int count1=0;
        for(int d=0;d<b.length();d++){
            if(b[d]=='_'){
                count1++;
            }
        }
        if(count1>=1){
            for(int v=0;v<b.length();v++){
                if(b[v]!='_'){
                    h=h+b[v];
                }
            }
            for (int i = 0; i < h.length(); ++i){
                answer.push_back(h[i]);
            }
            int count=0;
            sort(answer.begin(),answer.begin()+answer.size());
            for(int b=0;b<answer.size();b++){
                if(b==0){
                    if(answer.at(b)==answer.at(b+1)){
                        count++;
                    }
                }
                else if(b==answer.size()-1){
                    if(answer.at(b)==answer.at(b-1)){
                        count++;
                    }
                }
                else if((answer.at(b)==answer[b+1]) || (answer.at(b)==answer[b-1])){
                    count++;
                }
            }
            if(count == answer.size()){
                output.push_back("YES");
            }
            else{
                output.push_back("NO");
            } 

        }
        else if(count1==0){
            for(int r=0;r<b.length();r++){
                answer.push_back(b[r]-48);
            }
            int count=0;
            for(int b=0;b<answer.size();b++){
                if(b==0){
                    if(answer.at(b)==answer.at(b+1)){
                        count++;
                    }
                }
                else if(b==answer.size()-1){
                    if(answer.at(b)==answer.at(b-1)){
                        count++;
                    }
                }
                else if((answer.at(b)==answer[b+1]) || (answer.at(b)==answer[b-1])){
                    count++;
                }
            }
            if(count == answer.size()){
                output.push_back("YES");
            }
            else{
                output.push_back("NO");
            } 



        }
        
        
    }

    for (int i = 0; i < output.size(); ++i){
        cout << output.at(i) << endl;
    }


    
    return 0;
}
bool contains(char k){

    for(int t=0;t<u.length();t++){
        if(u[t]==k){
            return true;
        }
    }

    return false;

}
