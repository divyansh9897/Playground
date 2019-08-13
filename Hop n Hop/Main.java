#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
  int x,y,hop;
  scanf("%d\n%d\n",&x,&y);
  hop=abs(sqrt(pow(x-3,2)+(pow(y-4,2))));
  printf("%d\n",hop);
}