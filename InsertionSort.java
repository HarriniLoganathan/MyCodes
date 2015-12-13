

/**
 * 
 */

/**
 * @author Aruna
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	
	public static int[] InsertSorts(int[] input)
	{
		int temp;
		for (int i = 1; i < input.length; i++) {
	            for(int m = i  ; m > 0 ; m--){
	            	int j=m-1;
	                if(input[m] <input[j])
	                {
	                    temp = input[m];
	                    input[m] = input[j];
	                    input[j] = temp;
	                }
	            }
	        }
	        return input;
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		int[] input1 = {10,34,2,56,7,67,88,42};

        int[] arr2 = InsertSorts(input1);
        
        System.out.println("Length of my array to be sorted thro insertionsort is : "+arr2.length);

    System.out.print("Sorted array is : ");
        for(int i=0;i<arr2.length;i++){

            System.out.print(+arr2[i]);

            System.out.print(", ");
        }

	}

}
