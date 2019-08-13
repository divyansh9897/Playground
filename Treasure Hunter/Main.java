#include<stdio.h>
int main()
{
  float num_gc,ben_per,bb_per,ben_shr,bb_shr,pir_shr,total;
  scanf("%f\n%f\n%f\n",&num_gc,&ben_per,&bb_per);
  ben_shr=num_gc*(ben_per/100);
  ben_shr=floor(ben_shr);
  total=num_gc;
  num_gc=num_gc-ben_shr;
  bb_shr=num_gc*(bb_per/100);
  bb_shr=floor(bb_shr);
  pir_shr=num_gc-bb_shr;
  printf("%0.f\n%0.f\n%0.f\n",ben_shr,bb_shr,pir_shr/3);
}