import java.util.Scanner;
class INSERTION
{
	public static  int[] sort(int array[])
	{
		int j,i,key;
		for(j=1;j<array.length;j++)
		{
			key=array[j];
			i=j-1;
			while(i>=0 && array[i]>key)
			{
				array[i+1]=array[i];
				i=i-1;
			}
			array[i+1]=key;
		}
		for(i=0;i<array.length;i++)
			System.out.printf("%5d",array[i]);
		return array;
	}
	public static void main(String args[])
	{
		int i,size;
		Scanner scn=new Scanner(System.in);
		size= scn.nextInt();
		
		int array[] = new int[size];
		for(i=0;i<size;i++)
			array[i]=scn.nextInt();
		
		
		int[] new_array =INSERTION.sort(array);
		for(i=0;i<new_array.length;i++)
			System.out.printf("%6d",new_array[i]);
	}
}