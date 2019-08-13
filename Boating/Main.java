#include<stdio.h>
int main()
{ int tot_weight, limit,num_adt,num_chd;
  scanf("%d\n%d\n%d\n",&limit,&num_adt,&num_chd);
  //num_adt+=1;
  tot_weight=((num_adt*75)+(num_chd*30));
  if(tot_weight<limit)
  {
   printf("Boat is stable");
  }
 else
 {
  printf("Boat will drow");
 }
}