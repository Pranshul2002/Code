#include<stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int top = -1;

typedef struct
{
	int id;
	int value;
} stack;

typedef stack* Stack;

void CreateS(Stack newStackPtr,int max_stack_size){
	stack newStack[max_stack_size];
	newStackPtr = newStack; 
	top = -1;
	printf("Stack created\n");
}

bool IsFull(Stack _stack,int max_stack_size){
	if(top == max_stack_size - 1){
		return true;
	}
	else{
		return false;
	}
}

void Push(Stack _stack,int size,int item){
	if(IsFull(_stack,size)){

	}
	else{
		top++;
		(*(_stack + top)).id = top;
		(*(_stack + top)).value = item;
		if(IsFull(_stack,size)){
			printf("Stack Full!!\n");
		}
	}
}

bool IsEmpty(){
	if(top < 0){
		return true;
	}else{
		return false;
	}
}

stack Pop(Stack _stack){
	if(IsEmpty()){
		printf("Stack Empty\n");
	}else{
		return _stack[top--];
	}
}

void Display(Stack _stack,int size){
	for(int i = 0;i<size;i++){
		printf("Id: %d Element: %d\n",(_stack + i)->id, (_stack + i)->value);
	}
}

int main()
{
	printf("Enter size of stack:\n");
	int n;
	scanf("%d",&n);
	Stack newStackPtr = (Stack)malloc(n*sizeof(stack));
	CreateS(newStackPtr, n);
	printf("Enter elements\n");
	int item;
	for(int i = 0;i<n;i++){
		scanf("%d",&item);
		Push(newStackPtr,n,item);
	}
	printf("Array initialised.\n");
	Display(newStackPtr, n);
	printf("Removing elements\n");
	for(int i = 0;i<n;i++){
		stack s = Pop(newStackPtr);
		printf("Element %d removed at %d\n",s.value,s.id);
	}
	return 0;
}