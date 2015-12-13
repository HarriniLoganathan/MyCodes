/**
 * 
 */

/**
 * @author Aruna
 *
 */
public class Quicksort {

	public static int arr[];
	private int length;
	
	public void sort(int inputArr[])
	{
	if(inputArr==null||inputArr.length==0)
	return;
	this.arr=inputArr;
	length=inputArr.length;
	quicksort(0,length-1);
	}
	public static void quicksort(int low_index,int high_index)
	{
		int i= low_index;
		int j= high_index;
		int pivot= arr[(low_index+(low_index+high_index)/2)];
		 System.out.println(+pivot);
		 
		while(i<=j){
			while(arr[i]>pivot)
			{
				i++;
			}
			while(arr[j]<pivot)
			{
				j--;
			}
		}
		if(i<=j)
		{
			swaps(i,j);
			i++;
			j--;
			
		}
		
		if(low_index<j)
			
			quicksort(low_index,j);
		if(high_index>i)
			quicksort(i,high_index);
		
	}
	public static void swaps(int i,int j)
	{
	int temp;
	temp = arr[i];
	arr[i] = arr[j];
	arr[j]=temp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quicksort sorter = new Quicksort();

        int[] input = {24,2,45,20,56,2,56,99,53,12};

        sorter.sort(input);

        for(int i:input){

            System.out.print(i);

            System.out.print(" ");
        }
	}

}
