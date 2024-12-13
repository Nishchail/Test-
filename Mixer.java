
import java.util.Scanner;
public class Mixer 
{
	int arr[];
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
	}
	Mixer mix(Mixer A)
	{
		Mixer B = new Mixer();
		int k = this.arr.length+A.arr.length;
		B.arr = new int[k];
		int i, j, temp, small, pos;
		for(i=0; i<this.arr.length; i++)
		{
			B.arr[i] = this.arr[i];
		}
		for(i=0; i<this.arr.length; i++)
		{
			B.arr[this.arr.length+i] = A.arr[i];
		}
		for(i=0; i<B.arr.length-1; i++)
		{
			small = B.arr[i];
			pos=i;
			for(j=i+1; j<B.arr.length; j++)
			{
				if(B.arr[j]<small)
				{
					small = B.arr[j];
					pos = j;
				}
			}
			temp = B.arr[pos];
			B.arr[pos] = B.arr[i];
			B.arr[i] = temp;
		}
		return B;
	}
	void display()
	{
		for(int i=0; i<this.arr.length; i++)
		{
			System.out.print(this.arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements in Array 1:");
		int x = in.nextInt();
		System.out.println("Enter number of elements in Array 2:");
		int y = in.nextInt();
		Mixer obj1 = new Mixer();
		Mixer obj2 = new Mixer();
		obj1.arr = new int[x];
		obj2.arr = new int[y];
		System.out.println("Enter array 1 elements without any duplicates: ");
		obj1.accept();
		System.out.println("Enter array 2 elements without any duplicates: ");
		obj2.accept();
		in.close();
		System.out.println("Array 1: ");
		obj1.display();
		System.out.println("\nArray 2: ");
		obj2.display();
		System.out.println("\nMerged Array: ");
		obj1.mix(obj2).display();
	}
}
