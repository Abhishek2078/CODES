#include <stdio.h>
int main() {
int i,t1 = 0, t2= 1, next, a;
printf("Enter the value of a:\n"); 
scanf("%d", &a);
printf("%d %d:\n", t1,t2);
for(i=1;i<=a-2;i++)
{
next =t1 + t2; t1 = t2;
t2 = next;
printf("%d\n", next); }
return 0; }