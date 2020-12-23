#include<stdio.h>
void Reverse(int* ptr,int n){
	int temp;
	for(int i=0;i<n/2;i++){
		temp = ptr[i];
		ptr[i] = ptr[n-i - 1];
		ptr[n-i - 1] = temp;
	}
}
int main()
{
	int n;
	printf("Enter n\n");
	scanf("%d",&n);
	int arr[n];
	printf("Enter Array\n");
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	printf("Array before Reverse\n");
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	Reverse(arr,n);
	printf("Array after Reverse\n");
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	return 0;
}