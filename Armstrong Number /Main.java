#include <stdio.h>
int main() {
	int i,num1,num_digit,limit,digit,sum=0,power,constant;
  scanf("%d\n",&num1);
  i=num1;
  constant=num1;
  while (i>0)  //find number of digits  
  {
    num_digit++;
    i=i/10;
  }
limit=num_digit; // limit for while loop-exponent multiplication
for (int x=num_digit;x>0;x--) // finding digit raised to number of digits
{
  digit=num1%10;
  power=digit;
  while (limit>1)
  {
    power=power*digit;
    --limit;
  }
  limit=num_digit;
  sum+=power;
  num1=num1/10;
}
  if(sum==constant)
  {
    printf("Armstrong Number");
  }
  else
  {
   printf("Not an Armstrong Number");
  }
	return 0;
}