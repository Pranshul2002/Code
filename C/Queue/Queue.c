#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

int front;
int rear;

typedef struct
{
	int id;
	int value;
} queue;

typedef queue * Queue;

void CreateQ(int size, Queue q){
	q = (Queue)malloc(sizeof(queue)* size);
	front = -1;
	rear = -1;
}

bool IsFull(int size){
	if(rear == size - 1){
		return true;
	}else{
		return false;
	}
}

void AddQ(Queue q,queue element,int size){
	if(IsFull(size)){
		printf("Queue Full\n");
	}
	else{
		rear++;
		q[rear] = element;
	}
}

bool IsEmpty(){
	if(front == rear){
		return true;
	}else{
		return false;
	}
}

queue DeleteQ(Queue q){
	if(IsEmpty()){
		printf("Queue is empty\n");
		exit(100);
		}
	else{
		front++;
		return q[front];
	}
}

int main()
{
	/* code */
	printf("Enter size of queue:\n");
	int n;
	scanf("%d",&n);
	Queue q;
	CreateQ(n,q);
	printf("Enter elements\n");
	int item;
	queue _q;
	for(int i = 0;i<n;i++){
		_q.id = i;
		scanf("%d",&item);
		_q.value = item;
		AddQ(q,_q,n);
	}
	for(int i = 0;i<n;i++){
		queue q1 = DeleteQ(q);
		printf("Element %d removed at %d\n",q1.value,q1.id);
	}
	return 0;
}