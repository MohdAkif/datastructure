import java.util.Scanner;
class Quick_sort
{
	public static void quick(int array[],int start,int end)
	{
		if(end>start)
		{
			int position=Quick_sort.partion(array,start,end);
			Quick_sort.quick(array,start,position-1);
			Quick_sort.quick(array,position+1,end);
		}
	}
	public static int partion(int []array, int start,int end)
	{
		int temp;
		int x=array[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++)
		{
			if(array[j]<=x)
			{
					i++;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
			}
		}
		temp=array[i+1];
		array[i+1]=array[end];
		array[end]=temp;
		return i+1;
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int array [] = new int[size];
		for(int i=0;i<size;i++)
		 array[i]=sc.nextInt();
		Quick_sort.quick(array,0,size-1);
		for(int i=0;i<size;i++)
			System.out.printf("%5d",array[i]);
	}
}
		