#include<stdio.h>
int main()
{
  int num1,ones,ths;
  scanf("%d\n",&num1);
  ths=num1/1000;
  ones=num1%10;
  int sum= ones+ths;
  printf("%d\n",sum);
}