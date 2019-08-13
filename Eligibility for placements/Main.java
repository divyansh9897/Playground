#include<stdio.h>
#include<stdlib.h>
int main()
{
  char name[10];
  int reg_no, arr_no;
  float cgpa;
  scanf("%[^\n]%*c\n%d\n%f\n%d\n",&name,&reg_no,&cgpa,&arr_no);
  if (cgpa>=7.0 && arr_no==0)
  {
   printf("%s\n%d\nEligible to attend placement\n",name,reg_no);
  }
  else if (cgpa>=7.5 && (arr_no==1 || arr_no==2))
  {
   printf("%s\n%d\nEligible to attend placement\n",name,reg_no);
  }
  else
  {
   printf("%s\n%d\nNot Eligible to attend placement\n",name,reg_no);
  }
}