import java.util.Scanner;
class SORT
{
	public static void main(String args[])
	{
		int i,min,j,index;
		System.out.println("how many element are there ");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int array[] = new int[size];
		for(i=0;i<size;i++)
			array[i]=scn.nextInt();
		for(i=0;i<size;i++)
		{
			min=array[i];
			index=i;
			for(j=i+1;j<size;j++)
			{
				if(min>array[j])
				{
					min=array[j];
					index=j;
				}
			}
			array[index]=array[i];
			array[i]=min;
		}
		for(i=0;i<size;i++)
			System.out.printf("%5d",array[i]);
	}
}
		