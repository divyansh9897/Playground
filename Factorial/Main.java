#include<stdio.h>
int main(void)
{
	long int num1,prod=1;
  scanf("%ld\n",&num1);
  if (num1!=0)
  {
  while (num1>1)
  {
   prod=prod*num1;
   num1-=1;
    
  }
  printf("%ld\n",prod);
  }
  else if (num1==0)
    printf("%ld\n",0);
  else if (num1==1)
    printf("%ld\n",1);
}
