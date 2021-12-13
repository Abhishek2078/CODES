#include<stdio.h> 
int main()
{
int n1,n2,x,y,gcd,lcm;
 printf("Enter two numbers:\n"); 
 scanf("%d%d",&n1,&n2);
x=n1;
y=n2;
while(n1!=n2)
 {
if(n1>n2) {
n1=n1-n2; }
else {
n2=n2-n1; }
}
gcd=n1; 
lcm=(x*y)/gcd;
printf("Greatest common divisor=%d\n",gcd); 
printf("Least commom multiple=%d",lcm);
return 0; }