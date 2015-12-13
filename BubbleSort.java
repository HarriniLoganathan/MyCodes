/**
 * 
 */

public class BubbleSort {
	

	public static void swapnum(int i, int j, int[] array)
	{
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j]=temp;		
	}

	public static void print(int[] input)
	{
		System.out.print("Sorted Array : ");
		
		for(int i=0;i<input.length;i++)
		{
	System.out.print(+input[i]+",");
	}
	System.out.println("\n");
	}
	public static void sort(int[] array)
	{
		int n =array.length;
		
		System.out.println("Length of the array : " +n);
		
		for(int m = n; m >= 0; m--) 
		{
			boolean flag = false;
		for(int i=0;i<n-1;i++)
		{
			int j=i+1;
			if(array[i] > array[j])
			{
				swapnum(i,j,array);
				flag = true;
			}
			
			print(array);
		}
		if(flag == false) break;
				}
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] input = { 4, 2, 9, 1 };

		sort(input);

	}

}
