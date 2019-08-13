#include<stdio.h>
int main()
{
  int rad,side;
  scanf("%d\n%d\n",&rad,&side);
  rad=rad*2;
  if (rad>side)
  {
   printf("circle cannot be inside a Square\n");
  }
  else
  {
   printf("circle can be inside a square");
  }
}