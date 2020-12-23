#include<stdio.h>
#include <stdbool.h>
void Read(int n,int (*arr)[n],int m ){
	
	printf("Enter array\n" );
	for(int i = 0;i<m;i++)
		for(int j = 0;j<n;j++)
			scanf("%d",&arr[i][j]);

}

void Display(int n,int m,int (*arr)[n]){
    
	for(int i = 0;i<m;i++)
		{
			for(int j = 0;j<n;j++)
					{
						printf("%d ", *(*(arr+i)+j));
					}
			printf("\n");
		}
}
void multiply(int n1,int m1, int n2, int m2, int arr1[][n1],int arr2[][n2]){
	
	if(n1 != m2){
		printf("Wrong Dismensions\n");
	}else{
		int arr[m1][n2];
		for(int i = 0;i<m1;i++){
			for(int j=0;j<n2;j++){
				int sum = 0;
				for(int k=0;k<n1;k++){
					sum += arr1[i][k] * arr2[k][j];
				}
				arr[i][j] = sum;
			}
		}
		Display(n2,m1,arr);
	}
}
int main()
{
	int m1,n1,m2,n2;
	printf("Enter m1\n");
	scanf("%d",&m1);
	printf("Enter n1\n");
	scanf("%d",&n1);
	printf("Enter m2\n");
	scanf("%d",&m2);
	printf("Enter n2\n");
	scanf("%d",&n2);
	int arr1[m2][n2], arr2[m2][n2];
	Read(n1,arr1,m1);
	Display(n1,m1,arr1);
	Read(n2,arr2,m2);
	Display(n2,m2,arr2);
	multiply(n1,m1,n2,m2,arr1,arr2);
	return 0;
}
