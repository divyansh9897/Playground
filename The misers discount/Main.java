#include<stdio.h>
int main()
{
  float price_1,price_2,disc,tot_amt,disc_price,amt_save;
  scanf("%f\n%f\n%f\n",&price_1,&price_2,&disc);
  tot_amt=price_1+price_2;
  disc_price=tot_amt-(tot_amt*disc/100);
  amt_save=tot_amt-disc_price;
  printf("%.2f\n%.2f\n%.2f\n",tot_amt,disc_price,amt_save);
}