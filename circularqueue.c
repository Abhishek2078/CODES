#include<stdio.h>
#define CAP 5
 int front=0;
 int rear=0;
 int Q[CAP];
 void insert()
 {
     if(CAP==rear)
     {
         printf("Q is full");
     }
     else
     {
         int ele;
         printf("Enter the element\n");
         scanf("%d",&ele);
Q[rear]=ele;
rear++;
     }
 }
 void delete()
 {
     if(front==rear)
     {
         printf("Q is empty");
     }
     else
     {
         printf("Deleted items are:\n");
         for(int i=0;i<=rear-1;i++)
         {
             Q[i]=Q[i+1];
         }
     }
 }
 void display()
 {
     if (front==rear)
     {
        printf("Q is empty");
     }
     else
     {
         printf("Element in the queue is");
     for (int i = 0; i <=rear-1; i++)
     {
         printf("%d ",Q[i]); 
     }
     rear--;
     
 }
 }
 