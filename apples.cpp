
#include <string>



#include <vector>

#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>

using namespace std;


int main(){
    int s;
    int t;
    cin >> s >> t;
    int a;
    int b;
    cin >> a >> b;
    int m;
    int n;
    cin >> m >> n;
    vector<int> apple(m);
    for(int apple_i = 0;apple_i < m;apple_i++){
       cin >> apple[apple_i];
    }
    vector<int> orange(n);
    for(int orange_i = 0;orange_i < n;orange_i++){
       cin >> orange[orange_i];
    }
    int count1=0;
    
    int count2=0;
    
   for(int y=0;y<apple.size();y++){
        if((apple.at(y)+a>=s) && (apple.at(y)+a<=t)){
            count1++;
        }
        
    }
    for(int w=0;w<orange.size();w++){
        if(orange.at(w)+b>=s && orange.at(w)+b<=t){
            count2++;
        }
        
    }
    cout << count1 << endl;
    cout << count2 << endl;
    
    return 0;
}
