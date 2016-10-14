#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <time.h>

using namespace std;

int main()
{
	clock_t timer;
	timer = clock();
	unsigned long long column;
	unsigned long long row;

	cin >> column >> row;

	unsigned long long row1[column];

	for (int i = 0; i < column; ++i)
	{
		cin >> row1[i];

	}
	
	unsigned long long int temp;
	
	unsigned long long int length = sizeof(row1)/sizeof(row1[0]);

	for (unsigned long long int i = 0; i <row-1 ; i++)
	{
		temp = row1[0];
		for (unsigned long long i = 0; i < length-1; i++)
		{
			row1[i]=row1[i]^row1[i+1];
		}
		row1[length-1]=row1[length-1]^temp;

	}

	for (unsigned long long i = 0; i < length; ++i)
	{
		cout << row1[i] << " ";
	}
	timer = clock() - timer;
	cout << endl << "time for this computation" << "  "<<  timer/CLOCKS_PER_SEC << " sec";



	return 0;
}