import java.util.Scanner;
class Heap_sort
{
	static int temp;
	public static void maxHeapify(int []array,int i,int size)
	{	
		int left=2*i;
		int right=2*i+1;
		int largest;
		if((left<=size) && (array[left]>array[i]))
			largest=left;
		else
			largest=i;
		if(right<=size && array[right]>array[largest])
			largest=right;
		if(largest!=i)
		{
			temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			Heap_sort.maxHeapify(array,largest,size);
		}
	}
	public static void built_max_heap(int array[],int size)
	{
		for(int i=size/2;i>=0;i--)
		{
			Heap_sort.maxHeapify(array,i,size);
		}
	}
	public static void heap_sort(int array[],int size)
	{
		Heap_sort.built_max_heap(array,size);
		for(int i=size;i>=1;i--)
		{
			temp=array[i];
			array[i]=array[0];
			array[0]=temp;
			size=size-1;
			Heap_sort.maxHeapify(array,0,size);
		}
	}
	public static void main(String []args)
	{
		System.out.println("write how many element are there ");
		Scanner sc= new Scanner(System.in);
		int array[]={20,56,90,3,245,5};
		int size=array.length-1;
		Heap_sort.heap_sort(array,size);
		for(int i=0;i<size;i++)
			System.out.printf("%5d",array[i]);
	}
	
}
			
		