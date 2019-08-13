#include<stdio.h>
int main()
{
  int num1,num2,found;
  scanf("%d%d",&num1,&num2);
  int mul=num1*num2;
  for (int i=1;i<=mul;i++)
  {
    if(i%num1==0 && i%num2==0)
    {
     found=i;
      break;
    }
  
  }
    printf("%d\n",found);
  return 0;
}