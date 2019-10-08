import java.util.Scanner;
class Counting{
	
	public static void counting_sort(int array[],int []B,int k)
	{
		if(k<=array.length){
		int c[] = new int[array.length+1];
		for(int i=0;i<=k-1;i++)
			c[i]=0;
		int n=array.length;
		for(int i=1;i<n;i++)
			c[array[i]]=c[array[i]]+1;
		for(int i=1;i<=k;i++)
			c[i]=c[i]+c[i-1];
		for(int i=n-1;i>=0;i--){
			B[c[array[i]]]=array[i];
			c[array[i]]=c[array[i]]-1;
		}
		}
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		int k=array[0];
		for(int i=1;i<size;i++){
			if(k<array[i])
				k=array[i];
		}
		int B[]=new int[size];
		counting_sort(array,B,k);
		for(int i=0;i<size;i++)
			System.out.printf("%5d",B[i]);
	}
}