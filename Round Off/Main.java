#include<stdio.h>
#include<math.h>
int main()
{
 float x, flo_1;
  scanf("%f\n",&x);
  flo_1=x;
  x=floor(x);
  printf("%.0f\n",x);
  flo_1=ceil(flo_1);
  printf("%.1f\n",flo_1);
  x=(float)x;
  printf("%.1f\n",x);
}