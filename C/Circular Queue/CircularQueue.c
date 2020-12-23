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
	front = 0;
	rear = 0;
}

bool IsFull(int size){
	if((rear - front) == size - 1 || (front - rear) == size - 1){
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
		rear = (rear+1)%size;
		printf("%d\n", rear);
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

queue DeleteQ(Queue q,int size){
	if(IsEmpty()){
		printf("Queue is empty\n");
		exit(100);
		}
	else{
		front = (front+1)%size;
		return q[front];
	}
}

int main()
{
	/* code */
	printf("Enter size of queue:\n");
	int n;
	scanf("%d",&n);
	n++;
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

	printf("Queue is full : %d\n", IsFull(n) );

	for(int i = 0;i<n;i++){
		queue q1 = DeleteQ(q,n);
		printf("Element %d removed at %d\n",q1.value,q1.id);
	}
	printf("Queue is empty : %d\n", IsEmpty());

	return 0;
}