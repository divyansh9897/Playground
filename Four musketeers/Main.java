#include<stdio.h>
int main()
{ float x1,x2,x3,y1,y2,y3,x_new,y_new;
 scanf("%f\n",&x1);
 scanf("%f\n",&y1);
 scanf("%f\n",&x2);
 scanf("%f\n",&y2);
 scanf("%f\n",&x3);
 scanf("%f\n",&y3);
 x_new=(x1+x2+x3)/3;
 y_new=(y1+y2+y3)/3;
 printf("%.1f\n",x_new);
 printf("%.1f\n",y_new);
}