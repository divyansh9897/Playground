#include <stdio.h>
int main() {
int i,constant,num_digit,digit,sum=0;
  scanf("%d\n",&i);
  constant=i;
    while (i>0)  //find number of digits  
  {
    num_digit++;
    i=i/10;
  }
  int fact_numb=constant;
  for(int x=num_digit;x>0;x--)
  {
    digit=fact_numb%10;
    int fact=1;
   
    for (int x=1;x<=digit;x++)
    {
      fact=fact*x;
    }
    sum+=fact;
    fact_numb=fact_numb/10;
  }
  if(sum==constant)
  {
   printf("Yes");
  }
  else
  {
   printf("No");
  }
	return 0;
}