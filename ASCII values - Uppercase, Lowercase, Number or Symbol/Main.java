#include<stdio.h>
int main()
{
  char x;
  scanf("%c\n",&x);
  if(x>=97 && x<=122)
  {
   printf("Lowercase\n");
  }
  else if (x>=65 && x<=90)
  {
   printf("Upper\n");
  }
  else
  {
   printf("Symbol\n");
  }
}