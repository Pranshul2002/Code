#include<stdio.h>
#include <stdbool.h>
void Lsearch(int arr[],int n,int m){
	bool found = false;
	for(int i =0;i<n;i++){
		if(m == arr[i])
		{
			printf("Element found at index %d\n",i );
			found = true;
			break;
		}
	}
	if(!found){
		printf("Element not found\n");
	}
}
int main()
{
	printf("Enter n:\n");
	int n;
	scanf("%d",&n);
	int arr[n];
printf("Enter array\n" );
	for(int i = 0;i<n;i++){
		
		scanf("%d",&arr[i]);
	}
printf("Enter element to be found:\n");
int m;
scanf("%d",&m);
Lsearch(arr,n,m);
	return 0;
}