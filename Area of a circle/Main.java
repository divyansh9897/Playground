#include<stdio.h>
int main()
{
  float dia;
  scanf("%f\n",&dia);
  float area=(3.14)*(dia/2)*(dia/2);
  int intar=area;
  if (area==intar)
  {
  printf("%d\n",intar);
  }
  else
  {
    printf("%.2f\n",area);
  }
  return 0;
}