/**
 * 
 */

/**
 * @author Aruna
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static int[] selectionsort(int[] arr)
	{
		
	/*	for (int i = 0; i < arr.length - 1; i++)

        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
            {   if (arr[j] < arr[index]) 
                    index = j;
            }
              int smallestNum = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallestNum;
        }
*/
		for(int i=0;i<arr.length-1;i++)
		{
			int index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
					index=j;
					}
				int smallestNum = arr[index];
				arr[index]=arr[i];
				arr[i]=smallestNum;
				
			}
		
		return arr;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={10,2,5,1,8,3};
		
	/*	for(int i=0;i<=arr2.length;i++)
		{
			System.out.println(+arr2[i]);
			System.out.println(" , ");
			
		}*/
		
		int[] arr2= selectionsort(arr1);
		
		for(int i:arr2)
		{
			System.out.print(i);
			System.out.print(" , ");
			
		}

	}

}
