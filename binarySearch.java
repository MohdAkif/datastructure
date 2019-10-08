import java.util.Scanner;
class Binary
{
	public static int search(int array[],int start,int s,int l)
	{
		if(l>=start)
		{
			int mid=start+(l-start)/2;
			if(array[mid]==s)
				return mid;
			if(array[mid]>s)
				return Binary.search(array,start,s,mid-1);
			return Binary.search(array,mid+1,s,l);
		}
		return -1;
	}
	public static void quick_sort(int array[],int start, int end)
	{
		if(end>start){
		int position=Binary.partition(array,start,end);
		Binary.quick_sort(array,start,position-1);
		Binary.quick_sort(array,position+1,end);
		}
	}
	
	public static int partition(int array[],int start,int end)
	{
		int x=array[end];
		int temp;
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
		
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		Binary.quick_sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.printf("%5d",array[i]);
		System.out.println("");
		int s=sc.nextInt();
		int check=Binary.search(array,0,s,array.length-1);
		if(check==-1)
			System.out.println("element not there");
		else
			System.out.println("element found on the location on " + (check+1));
	}
}