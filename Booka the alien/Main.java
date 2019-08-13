#include<stdio.h>
int main()
{
  int num_days,tot_years,tot_weeks;
  scanf("%d\n",&num_days);
  tot_years=num_days/365;
  num_days-=365*tot_years;
  tot_weeks=num_days/7;
  num_days-=tot_weeks*7;
  printf("%d\n%d\n%d\n",tot_years,tot_weeks,num_days);

}