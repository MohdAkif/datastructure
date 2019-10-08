import java.util.Scanner;
class Linear
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		System.out.println("write the element  ");
		int search=sc.nextInt();
		int location=0;
		boolean flag=false;
		for(int i=0;i<size;i++)
			if(search==array[i])
			{
				flag=true;
				location=i;
				break;
			}
		if(flag==true)
		{
			System.out.println("element is found on the location on " + (location+1));
		}
		else
			System.out.printf("element not found");
	}
}