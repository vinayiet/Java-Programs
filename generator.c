#include<stdio.h>
#include<conio.h>
int main()
{
    int first,last,cd;
    printf("Enter the first number of the series \n");
    scanf("%d",&first);
    printf("Enter the last number of the series \n");
    scanf("%d",&last);
    printf("Enter the common difference \n");
    scanf("%d",&cd);
    for(int i = first;i<=last;i=i+2)
    {
        printf("%d,",i);
    }
    getch();
    return 0;
}