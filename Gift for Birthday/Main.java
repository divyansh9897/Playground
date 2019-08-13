#include<stdio.h>
int main()
{
  int year;
  scanf("%d\n",&year);
  if((year%100==0 && year%400==0)||(year%4==0))
  {
   printf("%d is a leap year\n",year);
  }
  else
  {
   printf("%d is not a leap year",year);
  }
}