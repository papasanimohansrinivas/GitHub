#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;


long long int row5;
vector<long long int>  nextrow1(long long int finalrow ,long long int presentrow,vector<long long int> array);

int main()
{
	
	long long int column;
	long long int finalrow;

	std::cin >> column >> finalrow;

	//cout << column;
	vector<long long int > firstRow;

	for (int i = 0; i < column;i++)
	{
		int g = 0;
		cin >>g ;
		firstRow.push_back(g);
	}

	int row3=0;

	vector<long long int > answer;

	answer = nextrow1(finalrow,1,firstRow);
	
	for (int i = 0; i < answer.size(); ++i)
	{
		std::cout << answer.at(i) << " ";
	}
	
	return 0;
}



vector<long long int > nextrow1(long long int finalrow,long long int presentrow, vector<long long int> row1){

	

	if(presentrow==finalrow){

		return row1;
	}
	else{
		
		presentrow=presentrow+1;

		std::vector<long long int> o;

		long long int length = row1.size();

		for (long long int i = 0; i < length-1; ++i)
		{
			o.at(i)=row1.at(i)^row1.at(i+1);
		}

		o.at(length-1)=row1.at(length-1)^row1.at(0);

		

		return nextrow1(finalrow,presentrow,o);
	}

}