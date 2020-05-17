#include<stdio.h>

int main()
{
	int a,b,sum,diff,product,quotient,remainder;
	scanf("%d",&a);
	scanf("%d",&b);
	sum=a+b;
	diff=a*b;
	product=a-b;
	quotient=a/b;
	remainder=a%b;
	printf("a+b=%d",sum);
	printf("\na-b=%d",product);
	printf("\na*b=%d",diff);
	printf("\na/b=%d",quotient);
	printf("\na%b=%d",remainder);
	return 0;
}