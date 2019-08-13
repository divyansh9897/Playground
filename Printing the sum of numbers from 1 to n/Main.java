#include <stdio.h>
int main() {
	int i,sum=0;
  scanf("%d\n",&i);
  for (int n=0;n<=i;n++)
  {
    sum=sum+n;
  }
  printf("%d\n",sum);
	return 0;
}