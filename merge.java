import java.util.Scanner;
class Merge
{
	public static void merge(int array[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			Merge.merge(array,start,mid);
			Merge.merge(array,mid+1,end);
			Merge.merging(array,start,mid,end);
		}
	}
	public static void merging(int array[],int start,int mid,int end)
	{
		int i=start,j=mid+1,index=start;
		int temp[]= new int[100];
		while((i<=mid) && (j<=end))
		{
			if(array[i]<array[j])
			{
				temp[index]=array[i];
				i++;
			}
			else
			{
				temp[index]=array[j];
				j++;
			}
			index++;
		}
		if(i>mid)
		{
			while(j<=end)
			{
				temp[index]=array[j];
				j++;
				index++;
			}
		}
		else
		{
			while(i<=mid)
			{
				temp[index]=array[i];
				i++;
				index++;
			}
		}
	
		for(int k=start;k<index;k++)
			array[k]=temp[k];
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		Merge.merge(array,0,size-1);
		for(int i=0;i<size;i++)
			System.out.printf("%5d",array[i]);
	}
}