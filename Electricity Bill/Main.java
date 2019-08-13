#include<stdio.h>
#include<stdlib.h>
int main()
{
  float units,bill;
  scanf("%f\n",&units);
  if(units<=200)
  {
    bill=units*0.5;
  }
  else if(units<=400)
  {
    bill=units*0.65;
    bill+=100;
  }
  else if(units<=600)
  {
    bill=units*0.8;
    bill+=200;
  }
   else
  {
    bill=units*1.25;
    bill+=425;
  }
  bill=ceil(bill);
  printf("Rs.%.0f\n",bill);
}