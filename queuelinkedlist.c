#include<stdio.h>
#include<stdlib.h>
struct Node{

int data;
struct Node *link;

};
struct Node* root=NULL;

void append();
void deletefirst();
void display();
void length();


int main()
{
    int choice;
    printf("\n*** Queue Implementation using Linked List Function ***\n");
    while(1)
    {
        printf("\n****** MENU ******\n");
        printf("1. Insert in Queue\n");
        printf("2. Delete From Queue\n");
        printf("3. Display Queue\n");
        printf("4. Front of the Queue\n");
        printf("5. Size of Queue\n");
        printf("6. Exit\n");

        printf("Enter your choice: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1: append();
                    break;
            case 2: deletefirst();
                    break;
            case 3: display();
                    break;
            case 4: if(root==NULL)
                        printf("\n Queue is Empty!!!\n");
                    else
                        printf("\n Data at front of the queue is %d \n",root->data);
                    break;
            case 5:
             length();
                    break;
            case 6: 
            exit(0);
            default:
                printf("\n invalid number \n");
        }
    }
return 0;
}

void append()
{
    struct Node *temp;
    temp=(struct Node*)malloc(sizeof(struct Node));
    printf("Insert the value you want to enter: ");
    scanf("%d",&temp->data);
    temp->link=NULL;
    if(root==NULL)
    {
     root=temp;
    }
    else
    {
        struct Node *p;
        p=root;
        while(p->link!=NULL)
        {
            p=p->link;
        }
        p->link=temp;
    }
    printf("\n Data inserted in Queue!!!\n");
}

void display()
{
    struct Node *temp;
    temp=root;
    if(root==NULL){
        printf("\n Queue is Empty!!!\n");
        return;
    }
    while(temp->link!=NULL)
    {
        printf("%d --> ",temp->data);
        temp=temp->link;
    }
    printf("%d\n",temp->data);
}


void length()
{
    struct Node *temp;
    int count=0;
    temp=root;
    if(temp==NULL){
        printf("\n Queue is Empty!!!\n");
        return;
    }
    while(temp->link!=NULL)
    {
        count++;
        temp=temp->link;
    }
    printf("\n Size of the queue is %d \n",count+1);
}

void deletefirst()
{
    struct Node *x;
    x=root;
    if(root==NULL){
        printf("\n Queue is Empty!!!\n");
        return;
    }
    printf("\n Deleted element is: %d\n", root->data);
    root=root->link;
    free(x);
}

