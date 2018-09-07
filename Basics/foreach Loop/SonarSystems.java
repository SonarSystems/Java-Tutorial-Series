
public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// int arr[] or int[] arr, they are the same
		float arr[] = {8.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 90.0f, 4.0f, 23.0f, 4.0f};
		
		//System.out.println(arr[5]);
		
		//System.out.println(arr.length);
		
		// loop through the array and print out all values
		/*for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/
		
		for (float e: arr)
		{
			System.out.println(e);
		}
	}

}
