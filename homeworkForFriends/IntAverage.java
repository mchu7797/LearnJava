package homeworkForFriends;

public class IntAverage {

	public static void main(String[] args) {
		int[] array = {17, 31, 25, 1, 4, -100};
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		
		System.out.println("Average of the array elements is " + (double)(total / array.length));
	}

}
