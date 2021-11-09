#include<bits/stdc++.h>
using namespace std;

struct student
{
    int id;
    float cgpa;
    string firstname;
};

bool compare(student lhs,student rhs)
{
  if (lhs.cgpa==rhs.cgpa)
  {
      if(lhs.firstname==rhs.firstname)
      {
          return lhs.id<rhs.id;
      }
      return lhs.firstname<rhs.firstname;
  }
  return lhs.cgpa>rhs.cgpa;
}

int main()
{
    int n;
    cin>>n;

    student abc[n];

    for(int i=0;i<n;i++)
    	cin >> abc[i].id >> abc[i].firstname >> abc[i].cgpa;

	sort(abc, abc+n, compare);

    for(int i=0;i<n;i++)
        cout << abc[i].firstname << '\n';

}
