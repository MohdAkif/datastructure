import java.util.Scanner;
class Bubble
{
	public static void main(String []args)
	{
		int i,j,size,temp;
		
		Scanner sc=new Scanner(System.in);
		
		size=sc.nextInt();
		int array[]= new int[size];
		
		for(i=0;i<size;i++)
			array[i]=sc.nextInt();
		
		for(i=0;i<size;i++)
		{
			for(j=i;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(i=0;i<size;i++)
			System.out.printf("%5d",array[i]);
	}
}