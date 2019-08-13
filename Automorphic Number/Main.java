#include<stdio.h>
int main()
{
  int x,x2;
  scanf("%d\n",&x);
  x2=x*x;
  if(x2%10==x)
  {
   printf("Automorphic Number");
  }
  else{printf("Not Automorphic Number");}
}