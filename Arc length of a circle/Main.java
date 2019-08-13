#include <stdio.h>
int main(void)
{
  float rad,angl,alen;
  scanf("%f%f\n",&rad,&angl);
  alen=(2*3.14*rad)*(angl/360);
  printf("%.2f\n",alen);
}