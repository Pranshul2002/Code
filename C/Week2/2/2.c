#include<stdio.h>
#include <stdlib.h>
int Smallest(int* arr,int n){
	int min = arr[0];
	for(int i=1;i<n;i++){
		if(min > arr[i]){
			min = arr[i];
		}
	}
	return min;
}
int main()
{
	/* code */
	int n;
	printf("Enter n\n");
	scanf("%d",&n);
	int * arr = (int *)calloc(n,sizeof(int));
	printf("Enter array\n");
	for(int i =0;i<n;i++){
		scanf("%d",(arr + i));
	}
	printf("Smallest number is %d\n", Smallest(arr,n));
	return 0;
}