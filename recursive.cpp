#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <time.h>
//#include <array>

using namespace std;

vector<unsigned long long int> recursion(unsigned long long int finalrow,unsigned long long int presentrow,vector<unsigned long long int> y);

int main()
{
	//clock_t timer;
	//timer = clock();
	unsigned long long int column;
	unsigned long long row;
	

	cin >> column >> row;

	

	vector<unsigned long long int> v(column);

	
	unsigned long long int value=0;
	for (unsigned long long int i = 0; i < column; ++i)
	{
		
		cin >> v.at(i);
		//v.push_back(value);

	}
	vector<unsigned long long int> answer;
	//cout << v.size();
	answer  = recursion(row,1,v);

	for (unsigned long long int i = 0; i <v.size() ; ++i)
	{
		cout << answer.at(i) << " ";
	}
	//timer = clock()-timer;
	//cout << endl << "time for this computation" << "  "<<  timer/CLOCKS_PER_SEC << " sec";

	return 0;
}

vector<unsigned long long int> recursion(unsigned long long int finalrow,unsigned long long int presentrow,vector<unsigned long long int> y){



	if(presentrow == finalrow){

		return y;

	}
	else{
		
		vector<unsigned long long int> t;

		

		for (int i = 0; i <y.size()-1 ; i++)
		{
			t.push_back(y.at(i)^y.at(i+1));
		}
		t.push_back(y.at(y.size()-1)^y.at(0));
		

		presentrow=presentrow+1;

		return recursion(finalrow,presentrow,t);

	}

}
