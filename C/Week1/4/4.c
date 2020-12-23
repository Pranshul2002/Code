#include<stdio.h>

int SecondLargest(int * arr,int n){
	int max1 = 0,max2 = 0;
	for(int i =0;i<n;i++){
		if(arr[i] > max1){
			max1 = arr[i];
		}	
	}
	for(int i=0;i<n;i++){
		if(arr[i] > max2 && arr[i] < max1){
			max2 = arr[i];
		}
	}
	return max2;
}

int main()
{
	/* code */
	int n;
	printf("Enter n\n");
	scanf("%d",&n);
	int arr[n];
	printf("Enter Array\n");
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	printf("Second Largest: %d\n",SecondLargest(arr,n));
	return 0;
}