#include<stdio.h>
int main()
{
  int num,test=7;
  scanf("%d\n",&num);
  for (int i=0; i<num; i++)
  {
   printf("%d ",test);
   test-=2;
     i++;
   if(i==num)
   {
    break;
   }
   
   printf("%d ",test);
   test+=3; 
  }

}