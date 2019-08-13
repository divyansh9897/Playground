#include<stdio.h>
int main()
{
  int year;
  scanf("%d\n",&year);
  if (year%100==0)
  {
   if(year%400==0)
   {
    printf("LEAP YEAR\n");
   }
   else
   {
    printf("NOT LEAP YEAR\n");
   }
  }
  else if (year%4==0)
  {
   printf("LEAP YEAR\n");
  }
  else
  {
   printf("NOT LEAP YEAR\n");
  }

  return 0;
}