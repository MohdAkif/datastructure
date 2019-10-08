#include<stdio.h>
#include<malloc.h>
void create_tree(struct node *);
struct node * insert_into_tree(struct node *,int);
void display_tree(struct node *);
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *tree;


int main()
{   
    int ch,item;
    struct node *ptr;
	create_tree(tree);
    do{
        printf("1.insert\n2.display \n choice  ");
        scanf("%d",&ch);
        printf("write the item");
        scanf("%d",&item);
        if(ch==1){
			printf("write the item");
            scanf("%d",&item);
            insert_into_tree(tree,item);
			}
        if(ch==2){
            display_tree(tree);
        
			}
	}while(ch<=2);
    return 0;
}

void create_tree(struct node *tree)
{
    tree=NULL;
}

struct node * insert_into_tree(struct node *tree,int item)
{
    struct node *parentptr , *nodeptr,*ptr;
    ptr=(struct node *)malloc(sizeof(struct node));
    ptr->left=NULL;
    ptr->right=NULL;
    if(tree==NULL){
        tree=ptr;
        tree->left=NULL;
        tree->right=NULL;
        return tree;
    }
    else{
        parentptr=NULL;
        nodeptr=tree;
        while(nodeptr!=NULL)
        {
            parentptr=nodeptr;
            if(nodeptr->data>item)
                nodeptr=nodeptr->left;
            else
                nodeptr=nodeptr->right;
        }
        if(parentptr->data>item)
            parentptr->left=ptr;
        else
            parentptr->right=ptr;
        return tree;
        
    }
}
void display_tree(struct node *tree)
{
    if(tree==NULL)
        printf("tree is empty");
    else{
        printf("%d\t",tree->data);
        display_tree(tree->left);
        display_tree(tree->right);
    }
}


