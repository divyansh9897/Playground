#include <stdio.h>
int main()
  
{
  
  int base=0,exp=0;
  scanf("%d%d\n",&base,&exp);
    int cons=base;
 if(exp<0)
 {
   printf("Wrong input\n");
 }
 else if(exp==0)
 {
   printf("%d\n",1);
 }
 else
 {
   while(exp>1)
   {
     base=base*cons;
     exp-=1;
   }
   printf("%d\n",base);
 }
return 0;
}