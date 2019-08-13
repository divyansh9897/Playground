#include<stdio.h>

int main()
{
  int num1,num2,num3,num4,min,arr_1[4];
  scanf("%d%d%d%d",&arr_1[0],&arr_1[1],&arr_1[2],&arr_1[3]);
  min=arr_1[0];
 for(int i=0;i<4;i++)
 {
   if (arr_1[i]<min)
   {
     min=arr_1[i];
   }
 }
 printf("%d\n",min);
}