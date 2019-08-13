#include <stdio.h>
int main() {
int i,fact=1;
  scanf("%d\n",&i);
    for (int x=1;x<=i;x++)
    {
      fact=fact*x;
    }
  printf("%d\n",fact);
  return 0;
}