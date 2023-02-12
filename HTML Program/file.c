#include<stdio.h>
int main()
{
	 	FILE *FP;
	 	char name[30];
	 	int mks;

	 	fp=fopen("z.text","w");
	 	if(fp==NULL)
	 	{
	 		printf("\n  unable to  to open this file");
	 	}
        else
        {
        	printf(" enter name of student");
         scanf(" %s %d",name,&mks);
           fprintf(FP, "%s\n marks=%d",name,mks);

        }
      return 0;
}