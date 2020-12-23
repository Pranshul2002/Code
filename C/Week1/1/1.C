#include<stdio.h>
double Add(double arr[],int n){
	double sum = 0.0;
	for(int i= 0;i<n;i++){
		sum =sum + arr[i];
	}
	return sum;
}
int main()
{
	printf("Enter n:\n");
	int n;
	scanf("%d",&n);
	double arr[n];
printf("Enter array\n" );
	for(int i = 0;i<n;i++){
		
		scanf("%lf",&arr[i]);
	}

	printf("Sum = %lf\n",Add(arr,n));
	return 0;
}